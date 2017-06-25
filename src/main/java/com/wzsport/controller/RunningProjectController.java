package com.wzsport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
@Api(tags = "RunningProject相关接口")
@RestController
@RequestMapping(value="/runningProjects",produces="application/json;charset=UTF-8")
public class RunningProjectController {

	@Autowired
	private RunningProjectService runningProjectService;
	
	/**
	* 更新项目指标
	* 
	* @param id
	* @param qualifiedDistance
	* @param qualifiedCostTime
	* @param minCostTime
	*/
	@ApiOperation(value = "更新项目指标", notes = "更改指定id的项目的运动指标:达标距离、达标时间和最少耗时")
	@RequestMapping(value="/{id}/updateIndex",method = RequestMethod.POST) 
	public ResponseEntity<?> updateIndex(
							@ApiParam("唯一主键id")
							@PathVariable("id") long id,
							@ApiParam("该项目达标的行动距离(单位：米)")
							@RequestParam int qualifiedDistance,
							@ApiParam("该项目达标的行动时间(单位：秒)")
							@RequestParam int qualifiedCostTime,
							@ApiParam("该项目的最少耗时(单位：秒)")
							@RequestParam int minCostTime,
							@ApiParam("该项目的运动数据采集间隔(单位：秒)")
							@RequestParam int acquisitionInterval
							) {
		boolean isSuccess = runningProjectService.updateIndex(id, qualifiedDistance, qualifiedCostTime, minCostTime, acquisitionInterval);
		if(isSuccess) {
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	/**
	* 更新项目的启用状态
	* 
	* @param id
	* @param enabled
	*/
	@ApiOperation(value = "更新项目启用状态", notes = "更改指定id的项目的启动状态，开启或者关闭")
	@RequestMapping(value="/{id}/updateEnable",method = RequestMethod.POST) 
	public ResponseEntity<?> updateEnable(
							@ApiParam("唯一主键id")
							@PathVariable("id") long id,
							@ApiParam("该项目的启用状态,true或者false")
							@RequestParam boolean enabled) {
		boolean isSuccess = runningProjectService.updateEnable(id, enabled);
		if(isSuccess) {
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
