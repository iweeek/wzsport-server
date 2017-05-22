package com.wzsport.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
* token拦截器,拦截带有token的请求，对其进行认证.
* 
* @author x1ny
* @date 2017年5月22日
*/
public class TokenInterceptor extends HandlerInterceptorAdapter {
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String token = request.getHeader("Authorization");
		if(token != null) {
			SecurityUtils.getSubject().login(new UsernamePasswordToken(token, ""));
		}
		return super.preHandle(request, response, handler);
	}
	
}
