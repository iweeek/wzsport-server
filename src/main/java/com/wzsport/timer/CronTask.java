package com.wzsport.timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.RunningActivityDataMapper;
import com.wzsport.mapper.RunningActivityMapper;
import com.wzsport.service.RunningActivityService;


@Component
public class CronTask {
	@Autowired
	RunningActivityDataMapper runningActivityDataMapper;
	@Autowired
	RunningActivityMapper runningActivityMapper;
	@Autowired
	RunningActivityService runningActivityService;
	
//	private static final Logger logger = LoggerFactory.getLogger(CronTask.class);
//	
//    @Scheduled(cron = "0 0 1 * * ?")  
//    public void job() {  
//
//    } 
}