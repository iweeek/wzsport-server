package com.wzsport.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.model.RunningActivity;
import com.wzsport.service.RunningActivityService;

/**
* RunningActivity Controller.
* 
* @author x1ny
* @date 2017年5月26日
*/
@RestController
@RequestMapping(value="/runningActivitys",produces="application/json;charset=UTF-8")
public class RunningActivityController {

	@Autowired
	private RunningActivityService runningActivityService;
	
	/**
	* 创建RunningActivity接口
	*/
	@RequestMapping(method = RequestMethod.POST)
	public RunningActivity create(@RequestParam int projectId,
								@RequestParam int studentId,
								@RequestParam int distance,
								@RequestParam int costTime,
								@RequestParam int targetTime,
								@RequestParam Long startTime) {
		RunningActivity runningActivity = new RunningActivity();
		runningActivity.setProjectId(projectId);
		runningActivity.setStudentId(studentId);
		runningActivity.setDistance(distance);
		runningActivity.setCostTime(costTime);
		runningActivity.setTargetTime(targetTime);
		runningActivity.setStartTime(new Date(startTime));
		return runningActivityService.create(runningActivity); 
	}

	public RunningActivityService getRunningActivityService() {
		return runningActivityService;
	}

	public void setRunningActivityService(RunningActivityService runningActivityService) {
		this.runningActivityService = runningActivityService;
	}
}
