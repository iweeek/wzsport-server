package com.wzsport.controller;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.wzsport.exception.ObjectNotFoundException;
import com.wzsport.interceptor.TokenInterceptor;
import com.wzsport.model.AreaActivityData;
import com.wzsport.service.CloudStorageService;
import com.wzsport.util.HttpRequestUtil;
import com.wzsport.util.PathUtil;
import com.wzsport.util.PropertyUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	private static final Logger logger = LogManager.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	
	/** The res body. */
	@SuppressWarnings("rawtypes")
	private ResponseBody resBody;
	
	private int status;

	@Autowired
	private CloudStorageService qiniuService;

	static final private String APP_SECRET = "56c7ff2a20c91dacc6a714ed5e4eb4fe";

	static final private String APP_ID = "wx2c8f990778df47a3";
	
	/**
	* 
	*/
	@ApiOperation(value = "搜索用户信息", notes = "搜索用户信息")
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ResponseEntity<?> show(
								@ApiParam("学校Id")
								@RequestParam Long universityId,
								@ApiParam("学号")
								@RequestParam String studentId) 
	{
		User user = new User();
		user.setUniversityId(universityId);
		
		if (studentId != null) {
			user.setUsername(studentId);
		}
		
		resBody = new ResponseBody<User>();
		
		status = userService.search(user, resBody);
		
		return ResponseEntity.status(status).body(resBody); 
	}
	
	@ApiOperation(value = "更新用户信息", notes = "更新用户信息")
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> update(
								@ApiParam("用户Id")
								@PathVariable Long id,
								@ApiParam("密码")
								@RequestParam String password)
	{
		//TODO 这个地方要判断open id，去数据库检查，匹配用户，才可以修改
		User user = new User();
		user.setId(id);
		
		user.setPassword(password);
		
		resBody = new ResponseBody<User>();
		
		status = userService.update(user, resBody);
		
		return ResponseEntity.status(status).body(resBody); 
	}

//	@ApiOperation(value = "修改个人密码", notes = "修改个人密码")
//	@RequestMapping(value = "/password", method = RequestMethod.POST)
//	public ResponseEntity<?> updatePwd(
//			@ApiParam("用户ID")
//			@RequestParam("userId") long userId,
//			@ApiParam("密码")
//			@RequestParam("password") String password
//	) {
//		User user;
//		try {
//			user = this.userService.getUserById(userId);
//		} catch (ObjectNotFoundException e) {
//			this.resBody = new ResponseBody<Integer>();
//			this.resBody.statusMsg = e.getMessage();
//			this.resBody.obj = 1000;
//			this.status = 404;
//			return ResponseEntity.status(status).body(resBody);
//		}
//
//		user.setPassword(password);
//		this.userService.update(user);
//
//		this.resBody = new ResponseBody<Integer>();
//		this.resBody.statusMsg = "修改密码成功！";
//		this.resBody.obj = 0;
//		this.status = 200;
//		return ResponseEntity.status(status).body(resBody);
//
//	}
	
	//	将路径解析成键值对数组
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private Map<String, String> parseQueryString(String str) {
		String[] paramArr = str.split("&");
		Map map = new HashMap();
		for(String param : paramArr) {
			String[] arr = param.split("=");
			if(arr.length > 1){
				map.put(arr[0], arr[1]);
			}
		}
		return map;
	}
	
	//参考：https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421140842。
	@SuppressWarnings({ "rawtypes", "deprecation" })
	@ApiOperation(value = "微信回调接口", notes = "微信回调接口")
	@RequestMapping(value = "/wechatAuth", method = RequestMethod.GET)
	//redirect_uri/?code=CODE&state=STATE
	public void wechatAuth(
			@ApiParam("微信code")
			@RequestParam String code,
			HttpServletRequest request,
			HttpServletResponse response) {
			String page = "";
			
			String url = "https://api.weixin.qq.com/sns/oauth2/access_token";
			
			String params = "appid=";
			params += APP_ID + "&secret=";
			params += APP_SECRET  + "&code=";
			params += code + "&grant_type=authorization_code";
			
			JsonParser parser = new JsonParser();
			String result = HttpRequestUtil.sendGet(url, params);
			if (result == null) {
				logger.error("获取openid失败");
				return;
			} else {
				JsonObject object = parser.parse(result).getAsJsonObject();
				String openid = object.get("openid").getAsString();
				if (openid == null) {
					logger.error("获取openid失败");
					return;
				}
				
				Map map = parseQueryString(request.getQueryString());
				String[] arr = java.net.URLDecoder.decode(map.get("page").toString()).split("[?]");
			    System.out.println("getWechatToken arr:" + arr);
			    if (arr.length > 1) {
			        page += arr[0];
			        page += "?openid=" + openid;
			        if (arr[1].split("#")[0] != "") {
			        	page += "&";
			        }
			        page += arr[1];
			    } else {
			    	if (arr[0].split("#").length > 1) {
			    		page += arr[0].split("#")[0];
				    	page += "?openid=" + openid;
				    	page += "#";
				    	page += arr[0].split("#")[1];
			    	} else {
				    	page += arr[0];
				    	page += "?openid=" + openid;
			    	}
			    }
			    
			    page = page.replace("&#", "#");
			    System.out.println("getWechatToken page:" + page);
			    
			    try {
					response.sendRedirect(page);	
				} catch (IOException e) {
					e.printStackTrace();
					return;
				}
				
			}
	
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
