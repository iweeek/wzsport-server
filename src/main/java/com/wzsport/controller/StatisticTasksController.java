package com.wzsport.controller;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.service.StatisticTaskService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "Task相关接口")
@RestController
@RequestMapping(value="/statisticTasks",produces="application/json;charset=UTF-8")
public class StatisticTasksController {
	@Autowired
	private StatisticTaskService taskService;
	
	private static final Logger logger = LogManager.getLogger(StatisticTaskService.class);

	@ApiOperation(value = "调用跑步运动的统计任务", notes = "调用跑步运动的统计任务")
	@RequestMapping(value="/runningActivityTask", method = RequestMethod.GET)
	public ResponseEntity<?> runningActiviy(@ApiParam("活动开始时间") @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd")  Date startDate,
	        @ApiParam("活动结束时间") @RequestParam(required = false)  @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) {
	    
	    if (startDate == null) {
	        DateTime yesterday = new DateTime().withMillisOfDay(0).minusDays(1);
	        startDate = yesterday.toDate();
	    }
	    
	    if (endDate == null) {
	        DateTime now = new DateTime();
	        endDate = now.withTimeAtStartOfDay().toDate();
	    }
	    
		try {
			taskService.runningActivityTask(startDate, endDate);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@ApiOperation(value = "调用跑步运动的统计任务", notes = "调用跑步运动的统计任务")
    @RequestMapping(value="/areaActivityTask", method = RequestMethod.GET)
    public ResponseEntity<?> areaActiviy(@ApiParam("活动开始时间") @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd")  Date startDate,
            @ApiParam("活动结束时间") @RequestParam(required = false)  @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) {
        
        if (startDate == null) {
            DateTime yesterday = new DateTime().withMillisOfDay(0).minusDays(1);
            startDate = yesterday.toDate();
        }
        
        if (endDate == null) {
            DateTime now = new DateTime();
            endDate = now.withTimeAtStartOfDay().toDate();
        }
        
        try {
            taskService.areaActivityTask(startDate, endDate);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            logger.error(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

	@RequestMapping(value="/sportConsumeStatistic", method = RequestMethod.GET)
	public ResponseEntity<?> sportConsumeStatistic() {
		try {
			taskService.sportConsumeStatisticTask();
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@RequestMapping(value="/signIn", method = RequestMethod.GET)
	public ResponseEntity<?> signIn() {
		try {
			taskService.signInTask();
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@ApiOperation(value = "调用跑步运动的统计任务", notes = "调用跑步运动的统计任务")
    @RequestMapping(value="/runningActivityDataStatisticTask", method = RequestMethod.GET)
    public ResponseEntity<?> runningActivityDataStatistic(@ApiParam("活动开始时间") @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd")  Date startDate,
            @ApiParam("活动结束时间") @RequestParam(required = false)  @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) {
        
        if (startDate == null) {
            DateTime yesterday = new DateTime().withMillisOfDay(0).minusDays(1);
            startDate = yesterday.toDate();
        }
        
        if (endDate == null) {
            DateTime now = new DateTime();
            endDate = now.withTimeAtStartOfDay().toDate();
        }
        
        try {
            taskService.runningActivityDataStatisticTask(startDate, endDate);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
	
	@ApiOperation(value = "调用跑步运动的统计任务", notes = "调用跑步运动的统计任务")
    @RequestMapping(value="/areaActivityDataStatisticTask", method = RequestMethod.GET)
    public ResponseEntity<?> areaActivityDataStatistic(@ApiParam("活动开始时间") @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd")  Date startDate,
            @ApiParam("活动结束时间") @RequestParam(required = false)  @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) {
        
        if (startDate == null) {
            DateTime yesterday = new DateTime().withMillisOfDay(0).minusDays(1);
            startDate = yesterday.toDate();
        }
        
        if (endDate == null) {
            DateTime now = new DateTime();
            endDate = now.withTimeAtStartOfDay().toDate();
        }
        
        try {
            taskService.areaActivityDataStatisticTask(startDate, endDate);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            logger.error(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
