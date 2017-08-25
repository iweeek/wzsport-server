package com.wzsport.controller;

import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.model.RunningActivityData;
import com.wzsport.service.RunningActivityDataService;
import com.wzsport.service.RunningActivityService;
import com.wzsport.util.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "RunningActivityData相关接口")
@RestController
@RequestMapping(value="/runningActivityData",produces="application/json;charset=UTF-8")
public class RunningActivityDataController {
	
	private static final Logger logger = LoggerFactory.getLogger(RunningActivityDataController.class);
	
	@Autowired
	private RunningActivityDataService runningActivityDataService;
	
	@Autowired
	private RunningActivityService runningActivityService;
	
	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "创建RunningActivityData", notes = "向服务端提交运动的采集数据")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(
								@ApiParam("活动id")
								@RequestParam long activityId,
								@ApiParam("运动步数累计")
								@RequestParam int stepCount,
								@ApiParam("运动距离（单位：米）")
								@RequestParam int distance,
								@ApiParam("当前的经度")
								@RequestParam double longitude,
								@ApiParam("当前的纬度")
								@RequestParam double latitude,
								@ApiParam("步幅（单位：厘米）")
								@RequestParam Byte stride,
								@ApiParam("每秒的步数")
								@RequestParam Byte stepsPerSecond,
								@ApiParam("定位类型")
								@RequestParam int locationType,
								@ApiParam("数据是否正常")
								@RequestParam boolean isNormal) {
		ResponseBody resBody = new ResponseBody();
		int status = 0;
		
		if (!runningActivityService.isActivityExist(activityId)) {
			String msg = "无效提交，activityId不存在，activityId: " + activityId;
			logger.error(msg);
			status = HttpServletResponse.SC_BAD_REQUEST;
			return ResponseEntity.status(status).build();
		}
		
		RunningActivityData runningActivityData = new RunningActivityData();
		
		runningActivityData.setActivityId(activityId);
		runningActivityData.setAcquisitionTime(new Date());
		runningActivityData.setStepCount(stepCount);
		runningActivityData.setDistance(distance);
		runningActivityData.setLongitude(longitude);
		runningActivityData.setLatitude(latitude);
		runningActivityData.setStride(stride);
		runningActivityData.setStepsPerSecond(stepsPerSecond);
		runningActivityData.setLocationType(locationType);
		runningActivityData.setIsNormal(isNormal);
		
		status = runningActivityDataService.create(runningActivityData, resBody);
		
		return ResponseEntity.status(status).body(resBody);
	}
}
