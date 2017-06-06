package com.wzsport.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.RunningActivityMapper;
import com.wzsport.mapper.RunningProjectMapper;
import com.wzsport.model.RunningActivity;
import com.wzsport.model.RunningProject;
import com.wzsport.service.RunningActivityService;
import com.wzsport.util.CalorieUtil;

/**
* RunningActivity Service 实现类.
*
* @author x1ny
* @date 2017年5月26日
*/
@Service
public class RunningActivityServiceImpl implements RunningActivityService {

	@Autowired
	private RunningProjectMapper runningProjectMapper;
	@Autowired
	private RunningActivityMapper runningActivityMapper;
	
	/* (non-Javadoc)
	 * @see com.wzsport.service.RunningActivityService#create(com.wzsport.model.RunningActivity)
	 */
	@Override
	public RunningActivity create(RunningActivity runningActivity) {
		
		RunningProject runningProject = runningProjectMapper.selectByPrimaryKey(runningActivity.getProjectId());
		//判断是否合格
		if(runningActivity.getDistance() >= runningProject.getQualifiedDistance()
				&& runningActivity.getTargetTime() != null
				&& runningActivity.getTargetTime() <= runningProject.getQualifiedCostTime()){
			runningActivity.setQualified(true);
		} else {
			runningActivity.setQualified(false);
		}
		
		//计算卡路里消耗
		int costCalorie = CalorieUtil.calculateCalorieConsumption(80, runningActivity.getCostTime(),
				runningProject.getHourlyCalorieConsumption());
		runningActivity.setCostCalorie(costCalorie);
		
		runningActivityMapper.insertSelective(runningActivity);
		
		return runningActivity;
	}
}
