package com.wzsport.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.model.RunningActivityData;
import com.wzsport.service.RunningActivityDataService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "RunningActivityData相关接口")
@RestController
@RequestMapping(value="/runningActivityData",produces="application/json;charset=UTF-8")
public class RunningActivityDataController {
	
	@Autowired
	private RunningActivityDataService runningActivityDataService;
	
	@ApiOperation(value = "创建RunningActivityData", notes = "向服务端提交运动的采集数据")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(
								@ApiParam("活动id")
								@RequestParam long activityId,
								@ApiParam("采集时间(使用时间戳格式,毫秒级)")
								@RequestParam long acquisitionTime,
								@ApiParam("运动步数累计")
								@RequestParam int stepCount,
								@ApiParam("运动距离(单位:米)")
								@RequestParam int distance,
								@ApiParam("当前的经度")
								@RequestParam double longitude,
								@ApiParam("当前的纬度")
								@RequestParam double latitude,
								@ApiParam("定位类型")
								@RequestParam int locationType,
								@ApiParam("数据是否正常")
								@RequestParam boolean isNormal) {
		
		RunningActivityData runningActivityData = new RunningActivityData();
		runningActivityData.setActivityId(activityId);
		runningActivityData.setAcquisitionTime(new Date(acquisitionTime));
		runningActivityData.setStepCount(stepCount);
		runningActivityData.setDistance(distance);
		runningActivityData.setLongitude(longitude);
		runningActivityData.setLatitude(latitude);
		runningActivityData.setLocationType(locationType);
		runningActivityData.setIsNormal(isNormal);
		
		runningActivityDataService.create(runningActivityData);
		
		return ResponseEntity.ok().build();
	}
}
