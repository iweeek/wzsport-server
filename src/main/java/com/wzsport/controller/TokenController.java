package com.wzsport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.dto.TokenDTO;
import com.wzsport.service.TokenService;

/**
* token资源的restful控制器
* 
* @author x1ny
* @date 2017年5月22日
*/
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
	@RequestMapping(method = RequestMethod.POST)
	public TokenDTO create(@RequestParam String username,
							@RequestParam String password,
							@RequestParam(required=false) Integer expiredHour
							) {
		if(expiredHour == null)
			return tokenService.create(username, password);
		return tokenService.create(username, password, expiredHour);
	}
	
	public TokenService getTokenService() {
		return tokenService;
	}

	public void setTokenService(TokenService tokenService) {
		this.tokenService = tokenService;
	}
}
