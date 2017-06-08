package com.wzsport.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.service.RunningProjectService;

/**
* RunningProject Controller.
* 
* @author x1ny
* @date 2017年5月25日
*/
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
	@RequestMapping(value="/{id}/updateIndex",method = RequestMethod.POST) 
	public ResponseEntity<?> updateIndex(@PathVariable("id") long id,
							@RequestParam int qualifiedDistance,
							@RequestParam int qualifiedCostTime,
							@RequestParam int minCostTime,
							HttpServletResponse response) {
		boolean isSuccess = runningProjectService.updateIndex(id, qualifiedDistance, qualifiedCostTime, minCostTime);
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
	@RequestMapping(value="/{id}/updateEnable",method = RequestMethod.POST) 
	public ResponseEntity<?> updateEnable(@PathVariable("id") long id,
							@RequestParam boolean enabled,
							HttpServletResponse response) {
		boolean isSuccess = runningProjectService.updateEnable(id, enabled);
		if(isSuccess) {
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
