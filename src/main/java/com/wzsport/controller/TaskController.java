package com.wzsport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.service.TaskService;

import io.swagger.annotations.Api;

@Api(tags = "Task相关接口")
@RestController
@RequestMapping(value="/task",produces="application/json;charset=UTF-8")
public class TaskController {
	@Autowired
	private TaskService taskService;

	@RequestMapping(value="", method = RequestMethod.GET)
	public ResponseEntity<?> runningActiviy() {
		try {
			taskService.runningActivityTask();
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
}
