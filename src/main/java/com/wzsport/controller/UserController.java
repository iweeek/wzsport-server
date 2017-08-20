package com.wzsport.controller;

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
}
