package com.wzsport.controller.handler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wzsport.util.ResponseUtil;

/**
* @ClassName: GlobalExceptionHandler
* @Description: 捕获处理所有未处理异常
* @author x1ny
* @date 2017年5月9日
*/
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
	private final Logger logger = LogManager.getLogger(GlobalExceptionHandler.class);

	/**
	* @author x1ny
	* @date 2017年5月9日
	* @Description: 处理shiro抛出的凭证错误异常
	* @param exception
	* @return
	* @throws
	*/
	@ExceptionHandler(IncorrectCredentialsException.class)
	public String exp(IncorrectCredentialsException exception) {
		return ResponseUtil.standardResponse(new String[]{"密码错误"}, null);
	}

	/**
	* @author x1ny
	* @date 2017年5月9日
	* @Description: 处理使用spring mvc的@RequestParam时，参数不存在时异常
	* @param exception
	* @return
	* @throws
	*/
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public String handler(MissingServletRequestParameterException exception) {
		return ResponseUtil.standardResponse(new String[]{"缺少参数：" + exception.getParameterName()}, null);
	}

	/**
	* @author x1ny
	* @date 2017年5月9日
	* @Description: 处理所有未知的异常
	* @param exception
	* @return
	* @throws
	*/
	@ExceptionHandler(Exception.class)
	public String handler(Exception exception) {
		logger.error(exception);
		return ResponseUtil.standardResponse(new String[]{"发生了未知异常"}, null);
	}
}
