package com.wzsport.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresGuest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wzsport.util.ResponseUtil;

/**
* @ClassName: AuthenticationController
* @Description: 认证服务控制器
* @author x1ny
* @date 2017年5月9日
*/
@Controller
@ResponseBody
@RequestMapping(value="/authentication",produces="application/json;charset=UTF-8")
public class AuthenticationController {
		

	/**
	* @author x1ny
	* @date 2017年5月9日
	* @Description: 登录接口
	* @param username - 用户名
	* @param password - 密码
	* @return
	* @throws
	*/
	@RequestMapping("/login")
	@RequiresGuest
	public String login(@RequestParam String username, @RequestParam String password) {
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		SecurityUtils.getSubject().login(token);
		return ResponseUtil.standardResponse(null, null);
	}

	/**
	* @author x1ny
	* @date 2017年5月9日
	* @Description: 注销接口
	* @return
	* @throws
	*/
	@RequestMapping("/logout")
	@RequiresAuthentication
	public String logout() {
		SecurityUtils.getSubject().logout();
		return ResponseUtil.standardResponse(null, null);
	}
}
