package com.wzsport.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.model.FixLocationOutdoorSportPoint;
import com.wzsport.service.FixLocationOutdoorSportPointService;
import com.wzsport.service.RunningActivityDataService;
import com.wzsport.service.RunningProjectService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
* RunningProject Controller.
* 
* @author x1ny
* @date 2017年5月25日
*/
@Api(tags = "定点室外运动点相关接口")
@RestController
@RequestMapping(value="/fixLocationOutdoorSportPoint")
public class FixLocationOutdoorSportPointController {
	private static final Logger logger = LoggerFactory.getLogger(FixLocationOutdoorSportPointController.class);
	
	@Autowired
	private FixLocationOutdoorSportPointService fixLocationSportPointService;

	/**
	* 更新项目指标
	* 
	* @param id
	* @param qualifiedDistance
	* @param qualifiedCostTime
	* @param minCostTime
	*/
	@ApiOperation(value = "创建一个室外定点活动点", notes = "")
	@RequestMapping(value = "/", method = RequestMethod.PUT) 
	public FixLocationOutdoorSportPoint fixLocationOutdoorSportPoint(
							@ApiParam("纬度")
							@RequestParam double latitude,
							@ApiParam("经度")
							@RequestParam double longitude,
							@ApiParam("活动点名称")
							@RequestParam String name,
							@ApiParam("定点活动区域的半径（米）")
							@RequestParam byte radius,
							@ApiParam("学校Id")
							@RequestParam int universityId
							) {
		FixLocationOutdoorSportPoint point = new FixLocationOutdoorSportPoint(latitude, longitude, name, radius, universityId);
		fixLocationSportPointService.put(point);
		return point;
	}
}
