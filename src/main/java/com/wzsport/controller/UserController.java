package com.wzsport.controller;

import javax.servlet.http.HttpServletResponse;

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
	public ResponseEntity<?> update(
								@ApiParam("学校Id")
								@RequestParam Long universityId,
								@ApiParam("学号")
								@RequestParam(required = false) String studentId,
								@ApiParam("姓名")
								@RequestParam(required = false) String name
								)
								{
		if (studentId == null && name == null) {
			status = HttpServletResponse.SC_BAD_REQUEST;
			return ResponseEntity.status(status).body(null);
		}
		
		User user = new User();
		user.setUniversityId(universityId);
		
		if (studentId != null) {
			user.setUsername(studentId);
		}
		
		resBody = new ResponseBody<User>();
		
		status = userService.search(user, resBody);
		
		return ResponseEntity.status(status).body(resBody); 
	}
}
