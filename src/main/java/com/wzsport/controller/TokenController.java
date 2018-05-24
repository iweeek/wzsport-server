package com.wzsport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.mapper.StudentMapper;
import com.wzsport.mapper.UserMapper;
import com.wzsport.model.Student;
import com.wzsport.model.User;
import com.wzsport.service.TokenService;
import com.wzsport.util.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
* token资源的restful控制器
* 
* @author x1ny
* @date 2017年5月22日
*/
@Api(tags = "Token相关接口")
@RestController
@RequestMapping(value="/tokens",produces="application/json;charset=UTF-8")
public class TokenController {
	
//	private int status = 0;

	@Autowired
	private TokenService tokenService;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private StudentMapper studentMapper;
	
	/**
	* 验证username和password，创建token
	* 
	* @param username 用户名
	* @param password 密码
	* @param expiredHour 过期时间(小时)
	*/
	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "创建token", notes = "验证用户名与密码，为用户创建一个用于鉴权的Token")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(
								@ApiParam("学校Id")
								@RequestParam long universityId,
								@ApiParam("用户名")
								@RequestParam String username,
								@ApiParam("密码")
								@RequestParam String password,
								@ApiParam("设备Id")
								@RequestParam String deviceId,
								@ApiParam("有效时间(单位:小时)，不填则默认为1")
								@RequestParam(required=false, defaultValue="1") Integer expiredHour,
								@RequestHeader("User-Agent") String userAgent
								) {
		System.out.println(userAgent);
		
		ResponseBody resBody = new ResponseBody();
		int status = tokenService.create(universityId, username, password, expiredHour, deviceId, userAgent, resBody);
		
		return ResponseEntity.status(status).body(resBody);
	}
	
	@ApiOperation(value = "创建token", notes = "验证用户名与密码，为用户创建一个用于鉴权的Token")
	@RequestMapping(value="/doSomething", method = RequestMethod.POST)
	public ResponseEntity<?> doSomething(
								) {
		
		System.out.println("begin");
//		for (int i = 1; i <= 50; i++) {
//			User user = new User();
//			user.setUsername("test" + i);
//			user.setPassword("e10adc3949ba59abbe56e057f20f883e");
//			user.setUniversityId(1l);
//			user.setUserType((byte)1);
//			user.setLatestToken("");
//			user.setAvatarUrl("");
//			user.setOpenId("");
//			userMapper.insert(user);
//			System.out.println("count: " + i);
//		}
		int j = 1;
		for (int i = 37183; i < 37233; i++) {
			Student student = new Student();
			student.setUserId(Long.valueOf(i));
			student.setClassId(0l);
			student.setUniversityId(1l);
			student.setStudentNo("test" + j);
			student.setMan(true);
			student.setName("test" + j);
			
			studentMapper.insert(student);
			System.out.println("count: " + j);
			j++;
		}
		System.out.println("end");
		
		return ResponseEntity.status(1).body(null);
	}
}
