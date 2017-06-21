package com.wzsport.service.impl;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.RunningActivityMapper;
import com.wzsport.mapper.RunningProjectMapper;
import com.wzsport.model.RunningActivity;
import com.wzsport.model.RunningActivityExample;
import com.wzsport.model.RunningActivityExample.Criteria;
import com.wzsport.model.RunningProject;
import com.wzsport.model.Term;
import com.wzsport.service.RunningActivityService;
import com.wzsport.service.TermService;
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
	@Autowired
	private TermService termService;
	
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
		int caloriesConsumed = CalorieUtil.calculateCalorieConsumption(80, runningActivity.getCostTime(),
				runningProject.getHourlyCalorieConsumption());
		runningActivity.setCaloriesConsumed(caloriesConsumed);
		
		//步数至少为1
		if(runningActivity.getStepCount() == 0) {
			runningActivity.setStepCount(1);
		}
				
		BigDecimal speed = new BigDecimal((double)runningActivity.getDistance() / runningActivity.getCostTime());
		runningActivity.setSpeed(speed.setScale(2, RoundingMode.HALF_UP).doubleValue());
		
		
		BigDecimal stepPerSecond = new BigDecimal((double)runningActivity.getStepCount() / runningActivity.getCostTime());
		runningActivity.setStepPerSecond(stepPerSecond.setScale(2, RoundingMode.HALF_UP).doubleValue());
		
		BigDecimal distancePerStep = new BigDecimal((double)runningActivity.getDistance() / runningActivity.getStepCount());
		runningActivity.setDistancePerStep(distancePerStep.setScale(2, RoundingMode.HALF_UP).doubleValue());
		
		runningActivityMapper.insertSelective(runningActivity);
		
		return runningActivity;
	}

	/* (non-Javadoc)
	 * @see com.wzsport.service.RunningActivityService#getCurrentTermQualifiedActivityCount(long)
	 */
	@Override
	public int getCurrentTermQualifiedActivityCount(long studentId, long universityId) {
		Term term = termService.getCurrentTerm(universityId);
		if(term != null) {
			RunningActivityExample runningActivityExample = new RunningActivityExample();
			runningActivityExample.createCriteria().andStartTimeBetween(term.getStartDate(), term.getEndDate())
												.andStudentIdEqualTo(studentId)
												.andQualifiedEqualTo(true);
			
			return (int) runningActivityMapper.countByExample(runningActivityExample);
		}
		return 0;
	}
	
	

	@Override
	public int getCurrentTermActivityCount(long studentId, long universityId) {
		Term term = termService.getCurrentTerm(universityId);
		if(term != null) {
			RunningActivityExample runningActivityExample = new RunningActivityExample();
			runningActivityExample.createCriteria().andStartTimeBetween(term.getStartDate(), term.getEndDate())
												.andStudentIdEqualTo(studentId);
			
			return (int) runningActivityMapper.countByExample(runningActivityExample);
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wzsport.service.RunningActivityService#getStudentCaloriesConsumption(long)
	 */
	@Override
	public int getStudentCaloriesConsumption(long studentId) {
		Integer caloriesConsumption = runningActivityMapper.sumCaloriesConsumedByStudentId(studentId);
		return caloriesConsumption == null ? 0 : caloriesConsumption;
	}

	/* (non-Javadoc)
	 * @see com.wzsport.service.RunningActivityService#getStudentTimeCosted(long)
	 */
	@Override
	public int getStudentTimeCosted(long studentId) {
		Integer timeCosted = runningActivityMapper.sumCostTimeByStudentId(studentId);
		return timeCosted == null ? 0 : timeCosted;
	}

	@Override
	public int getStudentCaloriesConsumption(long studentId, Date start, Date end) {
		Integer timeCosted = runningActivityMapper.sumCaloriesConsumedByStudentIdAndDuration(studentId, start, end);
		return timeCosted == null ? 0 : timeCosted;
	}

	@Override
	public int getStudentTimeCosted(long studentId, Date start, Date end) {
		Integer timeCosted = runningActivityMapper.sumCostTimeByStudentIdAndDuration(studentId, start, end);
		return timeCosted == null ? 0 : timeCosted;
	}

	/* (non-Javadoc)
	 * @see com.wzsport.service.RunningActivityService#getQualifiedActivityCount(long, java.util.Date, java.util.Date)
	 */
	@Override
	public int getQualifiedActivityCount(long studentId, Date start, Date end) {
		RunningActivityExample runningActivityExample = new RunningActivityExample();
		Criteria criteria = runningActivityExample.createCriteria().andStudentIdEqualTo(studentId)
											.andQualifiedEqualTo(true);
		if(start != null) {
			criteria.andStartTimeGreaterThanOrEqualTo(start);
		}
		
		if(end != null) {
			criteria.andStartTimeLessThanOrEqualTo(end);
		}
		
		return (int) runningActivityMapper.countByExample(runningActivityExample);
	}
}
