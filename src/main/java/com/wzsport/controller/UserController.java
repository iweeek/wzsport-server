package com.wzsport.controller;

import com.wzsport.exception.ObjectNotFoundException;
import com.wzsport.model.AreaActivityData;
import com.wzsport.service.CloudStorageService;
import com.wzsport.util.PathUtil;
import com.wzsport.util.PropertyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.model.User;
import com.wzsport.service.UserService;
import com.wzsport.util.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

/**
* User Controller.
* 
* @author x1ny
* @date 2017年5月26日
*/
@Api(tags = "User相关接口")
@RestController()
@RequestMapping(value = "/users",produces = "application/json;charset=UTF-8")
public class UserController {

	@Autowired
	private UserService userService;
	
	/** The res body. */
	@SuppressWarnings("rawtypes")
	private ResponseBody resBody;
	
	private int status;

	@Autowired
	private CloudStorageService qiniuService;
	
	/**
	* 
	*/
	@ApiOperation(value = "搜索用户信息", notes = "搜索用户信息")
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ResponseEntity<?> update(
								@ApiParam("用户名")
								@RequestParam String username,
								@ApiParam("学校Id")
								@RequestParam Long universityId)
								{
		
		User user = new User();
		user.setUsername(username);
		user.setUniversityId(universityId);

		resBody = new ResponseBody<User>();
		
		status = userService.search(user, resBody);
		
		return ResponseEntity.status(status).body(resBody); 
	}

	@ApiOperation(value = "修改个人密码", notes = "修改个人密码")
	@RequestMapping(value = "/password", method = RequestMethod.POST)
	public ResponseEntity<?> updatePwd(
			@ApiParam("用户ID")
			@RequestParam("userId") long userId,
			@ApiParam("密码")
			@RequestParam("password") String password
	) {
		User user;
		try {
			user = this.userService.getUserById(userId);
		} catch (ObjectNotFoundException e) {
			this.resBody = new ResponseBody<Integer>();
			this.resBody.statusMsg = e.getMessage();
			this.resBody.obj = 1000;
			this.status = 404;
			return ResponseEntity.status(status).body(resBody);
		}

		user.setPassword(password);
		this.userService.update(user);

		this.resBody = new ResponseBody<Integer>();
		this.resBody.statusMsg = "修改密码成功！";
		this.resBody.obj = 0;
		this.status = 200;
		return ResponseEntity.status(status).body(resBody);

	}

	@ApiOperation(value = "上传用户头像", notes = "上传用户头像")
	@RequestMapping(value = "/upload/avatar", method = RequestMethod.POST)
	public ResponseEntity<?> uploadAvatar(
			@ApiParam("用户ID")
			@RequestParam("userId") long userId,
			@ApiParam("图片")
			@RequestParam("mfile") MultipartFile mfile
	) throws IOException {

		User user;
		try {
			user = this.userService.getUserById(userId);
		} catch (ObjectNotFoundException e) {
			this.resBody = new ResponseBody<Integer>();
			this.resBody.statusMsg = e.getMessage();
			this.resBody.obj = 1000;
			this.status = 404;
			return ResponseEntity.status(status).body(resBody);
		}

		String fileName = Calendar.getInstance().getTimeInMillis() + "-" + mfile.getOriginalFilename();
		String filePath = PathUtil.getImages() + fileName;
		File file = new File(filePath);

		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdir();
		}

		if (!file.exists()) {
			file.createNewFile();
		}

		mfile.transferTo(file);

		this.qiniuService.setBucket(PropertyUtil.getProperty("qiniu.wzsport_head_image_bucket"));
		this.qiniuService.uploadImage(filePath, fileName);
		file.delete();

		user.setAvatarUrl(fileName);
		this.userService.update(user);

		user = this.userService.generateAvatarUrl(user);

		this.resBody = new ResponseBody<User>();
		this.resBody.statusMsg = "头像上传成功了！";
		this.resBody.obj = user;
		this.status = 200;
		return ResponseEntity.status(status).body(resBody);

	}
}
