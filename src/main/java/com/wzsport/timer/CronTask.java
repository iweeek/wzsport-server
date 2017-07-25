package com.wzsport.timer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.RunningActivityDataMapper;
import com.wzsport.mapper.RunningActivityMapper;
import com.wzsport.model.RunningActivity;
import com.wzsport.model.RunningActivityData;
import com.wzsport.model.RunningActivityDataExample;
import com.wzsport.model.RunningActivityExample;
import com.wzsport.service.RunningActivityService; 

@Component
public class CronTask {
	@Autowired
	RunningActivityDataMapper runningActivityDataMapper;
	@Autowired
	RunningActivityMapper runningActivityMapper;
	@Autowired
	RunningActivityService runningActivityService;
	
    @Scheduled(cron = "*/5 * * * * ?")  
    public void job() {  
    	//找到昨天所有没有正常结束的活动
    	RunningActivityExample example = new RunningActivityExample();
    	example.createCriteria().andEndedAtIsNull();
    	List<RunningActivity> list = runningActivityMapper.selectByExample(example);
    	int targetFinishedTime = 0;
    	int distance = 0;
    	int stepCount = 0;
    	int costTime = 0;
    	
    	System.out.println("job list size: " + list.size());
    	
    	//根据活动数据表最后一条记录来进行统计，把结果写入活动表
    	for (RunningActivity act : list) {
    		RunningActivityDataExample dataExample = new RunningActivityDataExample();
    		dataExample.createCriteria().andActivityIdEqualTo(act.getId());
    		dataExample.setOrderByClause("created_at asc");
    		List<RunningActivityData> runningActivityDataList = runningActivityDataMapper.selectByExample(dataExample);
    		System.out.println("job act data list: " + runningActivityDataList.size());
    		if (runningActivityDataList.size() > 0) {
	    		for (RunningActivityData data : runningActivityDataList) {
	    			if (data.getDistance() > act.getQualifiedDistance() && targetFinishedTime == 0) {
	    				targetFinishedTime = (int) ((data.getCreatedAt().getTime() - act.getStartTime().getTime()) / 1000);
	    			}
	    		}
	    		
	    		distance = runningActivityDataList.get(runningActivityDataList.size() - 1).getDistance();
	    		stepCount = runningActivityDataList.get(runningActivityDataList.size() - 1).getStepCount();
	    		costTime = (int) ((runningActivityDataList.get(runningActivityDataList.size() - 1).getCreatedAt().getTime()
	    				- runningActivityDataList.get(0).getCreatedAt().getTime()) / 1000);
	    		System.out.println("job distance: " + distance);
	    		System.out.println("job stepCount: " + stepCount);
	    		System.out.println("job costTime: " + costTime);
	    		System.out.println("job targetFinishedTime: " + targetFinishedTime);
	    		
	    		RunningActivity runningActivity = new RunningActivity();
	    		runningActivity.setId(act.getId());
	    		runningActivity.setDistance(distance);
	    		runningActivity.setStepCount(stepCount);
	    		runningActivity.setCostTime(costTime);
	    		runningActivity.setTargetFinishedTime(targetFinishedTime);
	    		
	    		runningActivity = runningActivityService.endRunningActivity(runningActivity);
    		}
    	}
    	
    } 
}
