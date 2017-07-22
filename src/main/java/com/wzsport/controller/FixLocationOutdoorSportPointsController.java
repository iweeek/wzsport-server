package com.wzsport.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
@RequestMapping(value="/fixLocationOutdoorSportPoints")
public class FixLocationOutdoorSportPointsController {
	private static final Logger logger = LoggerFactory.getLogger(FixLocationOutdoorSportPointsController.class);
	
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
	@ApiOperation(value = "创建一个室外定点活动点", notes = "使用POST来创建一个新的室外活动地点，这个时候对父一级目录进行请求，由服务端来分配创建一个新资源")
	@RequestMapping(value = "/", method = RequestMethod.POST) 
	public FixLocationOutdoorSportPoint create(
							@ApiParam("纬度")
							@RequestParam double latitude,
							@ApiParam("经度")
							@RequestParam double longitude,
							@ApiParam("活动点名称")
							@RequestParam String name,
							@ApiParam("定点活动区域的半径（米）")
							@RequestParam byte radius,
							@ApiParam("学校Id")
							@RequestParam int universityId,
							@ApiParam("对该地点的描述")
							@RequestParam String desc,
							HttpServletResponse response
							) {
		FixLocationOutdoorSportPoint point = new FixLocationOutdoorSportPoint(latitude, longitude, name, radius, universityId, desc);
		response.setStatus(fixLocationSportPointService.create(point));
		return point;
	}
	
	@ApiOperation(value = "获取一个室外定点活动点", notes = "根据名称来获取一个活动点")
	@RequestMapping(value = "/{name}", method = RequestMethod.GET) 
	public FixLocationOutdoorSportPoint show(
							@PathVariable String name,
							HttpServletResponse response
							) {
		FixLocationOutdoorSportPoint point = new FixLocationOutdoorSportPoint();
		point.setName(name);
		response.setStatus(fixLocationSportPointService.get(point));
		return point;
	}
	
	@ApiOperation(value = "更新一个室外定点活动点", notes = "根据名称来更新一个活动点")
	@RequestMapping(value = "/{name}", method = RequestMethod.POST) 
	public FixLocationOutdoorSportPoint update(
			@ApiParam("纬度")
			@RequestParam double latitude,
			@ApiParam("经度")
			@RequestParam double longitude,
			@ApiParam("活动点名称")
			@RequestParam String name,
			@ApiParam("定点活动区域的半径（米）")
			@RequestParam byte radius,
			@ApiParam("学校Id")
			@RequestParam int universityId,
			@ApiParam("对该地点的描述")
			@RequestParam String desc,
			HttpServletResponse response
			) {
				FixLocationOutdoorSportPoint point = new FixLocationOutdoorSportPoint(latitude, longitude, name, radius, universityId, desc);
				response.setStatus(fixLocationSportPointService.update(point));
				return point;
	}
	
	@ApiOperation(value = "获取室外定点活动点列表", notes = "")
	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public List<FixLocationOutdoorSportPoint> index(HttpServletResponse response) {
		List<FixLocationOutdoorSportPoint> list = new ArrayList<FixLocationOutdoorSportPoint>();
		response.setStatus(fixLocationSportPointService.index(list));
		return list;
	}
}
