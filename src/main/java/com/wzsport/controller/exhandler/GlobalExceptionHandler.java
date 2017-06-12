package com.wzsport.controller.exhandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public ResponseEntity<RestError> handler(IncorrectCredentialsException exception) {
		RestError restError = new RestError();
		restError.setStatus(HttpStatus.UNAUTHORIZED.value());
		restError.setCode(HttpStatus.UNAUTHORIZED.value());
		restError.setMessage("用户名或密码错误");
		restError.setDeveloperMessages(new String[]{exception.getMessage()});
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(restError);
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
	public ResponseEntity<RestError> handler(MissingServletRequestParameterException exception) {
		RestError restError = new RestError();
		restError.setStatus(HttpStatus.BAD_REQUEST.value());
		restError.setCode(HttpStatus.BAD_REQUEST.value());
		restError.setMessage("缺少请求参数:" + exception.getParameterName());
		restError.setDeveloperMessages(new String[]{exception.getMessage()});
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(restError);
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
	public ResponseEntity<RestError> handler(Exception exception) {
		RestError restError = new RestError();
		restError.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		restError.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		restError.setMessage("服务器发生了未知错误");
		restError.setDeveloperMessages(new String[]{exception.getMessage()});
		logger.error(exception);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(restError);
	}
}
