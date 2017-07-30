package com.wzsport.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.model.AreaActivity;
import com.wzsport.service.AreaActivityService;
import com.wzsport.util.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
* AreaActivity Controller.
* 
* @author x1ny
* @date 2017年5月26日
*/
@Api(tags = "AreaActivity相关接口")
@RestController()
@RequestMapping(value = "/areaActivities",produces = "application/json;charset=UTF-8")
public class AreaActivityController {

	@Autowired
	private AreaActivityService areaActivityService;
	
	/** The res body. */
	@SuppressWarnings("rawtypes")
	private ResponseBody resBody;
	
	private int status;
	
	/**
	* 创建AreaActivity接口
	*/
	@ApiOperation(value = "创建AreaActivity", notes = "向服务端提交一条活动结果数据，服务端对其进行验证后存储至数据库并返回数据。")
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<?> create(
								@ApiParam("活动项目id，目前仅对应AreaSport的id")
								@RequestParam long areaSportId,
								@ApiParam("学生id") 
								@RequestParam long studentId)
								{
		AreaActivity areaActivity = new AreaActivity();
		areaActivity.setAreaSportId(areaSportId);
		areaActivity.setStudentId(studentId);
		areaActivity.setStartTime(new Date());
		
		resBody = new ResponseBody<AreaActivity>();
		
		status = areaActivityService.create(areaActivity, resBody);
		return ResponseEntity.status(status).body(resBody); 
	}
	
	/**
	* 
	*/
	@ApiOperation(value = "结束运动", notes = "结束运动，更新运动结束时间")
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> update(
								@ApiParam("活动项目id")
								@PathVariable long id)
								{
		
		AreaActivity areaActivity = new AreaActivity();
		areaActivity.setId(id);
		
		resBody = new ResponseBody<AreaActivity>();
		
		status = areaActivityService.update(areaActivity, resBody);
		
		return ResponseEntity.status(status).body(resBody); 
	}
}
