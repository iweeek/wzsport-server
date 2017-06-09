package com.wzsport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.dto.TokenDTO;
import com.wzsport.service.TokenService;

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

	@Autowired
	private TokenService tokenService;
	
	/**
	* 验证username和password，创建token
	* 
	* @param username 用户名
	* @param password 密码
	* @param expiredHour 过期时间(小时)
	*/
	@ApiOperation(value = "创建token", notes = "验证用户名与密码，为用户创建一个用于鉴权的Token")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<TokenDTO> create(
								@ApiParam("用户名")
								@RequestParam String username,
								@ApiParam("密码")
								@RequestParam String password,
								@ApiParam("有效时间(单位:小时),不填则默认为1")
								@RequestParam(required=false) Integer expiredHour
								) {
		TokenDTO token = null;
		if(expiredHour == null) {
			token =  tokenService.create(username, password);
		} else {
			token =  tokenService.create(username, password, expiredHour);
		}
		
		if(token != null) {
			return ResponseEntity.ok().body(token);
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
}
