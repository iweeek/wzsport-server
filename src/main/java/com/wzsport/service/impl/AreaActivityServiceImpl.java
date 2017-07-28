package com.wzsport.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.AreaActivityMapper;
import com.wzsport.mapper.AreaSportMapper;
import com.wzsport.model.AreaActivity;
import com.wzsport.model.AreaActivityExample;
import com.wzsport.model.AreaSport;
import com.wzsport.model.AreaActivityExample.Criteria;
import com.wzsport.model.Term;
import com.wzsport.service.AreaActivityService;
import com.wzsport.service.TermService;
import com.wzsport.util.CalorieUtil;

/**
 * AreaActivity Service 实现类.
 *
 * @author x1ny
 * @date 2017年5月26日
 */
@Service
public class AreaActivityServiceImpl implements AreaActivityService {

	/** The area sport mapper. */
	@Autowired
	private AreaSportMapper areaSportMapper;
	
	/** The area activity mapper. */
	@Autowired
	private AreaActivityMapper areaActivityMapper;
	
	/** The term service. */
	@Autowired
	private TermService termService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wzsport.service.AreaActivityService#create(com.wzsport.model.
	 * AreaActivity)
	 */
	@Override
	public AreaActivity create(AreaActivity areaActivity) {
		// 根据学生ID和开始时间来判断数据是否重复
		AreaActivityExample sameRecordExample = new AreaActivityExample();
		sameRecordExample.createCriteria().andStudentIdEqualTo(areaActivity.getStudentId())
				.andStartTimeEqualTo(areaActivity.getStartTime());
		List<AreaActivity> sameRecordList = areaActivityMapper.selectByExample(sameRecordExample);
		if (sameRecordList.size() != 0) {
			throw new DuplicateKeyException("运动记录重复");
		}

		// 获取关联的项目
		AreaSport areaSport = areaSportMapper.selectByPrimaryKey(areaActivity.getAreaSportId());

		// 判断是否合格
		if (areaActivity.getCostTime() > areaSport.getQualifiedCostTime()) {
			areaActivity.setQualified(true);
		} else {
			areaActivity.setQualified(false);
		}

		// 计算卡路里消耗
		int caloriesConsumed = CalorieUtil.calculateCalorieConsumption(68, areaActivity.getCostTime(),
				areaSport.getHourlyKcalConsumption());
		areaActivity.setKcalConsumed(caloriesConsumed);

		// 插入数据
		areaActivityMapper.insertSelective(areaActivity);

		return areaActivity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wzsport.service.AreaActivityService#startAreaActivity(long,
	 * long, java.util.Date)
	 */
	public AreaActivity startAreaActivity(long studentId, long areaSportId, Date startTime) {

		AreaSport areaSport = areaSportMapper.selectByPrimaryKey(areaSportId);

		AreaActivity areaActivity = new AreaActivity();
		areaActivity.setStudentId(studentId);
		areaActivity.setAreaSportId(areaSportId);
		areaActivity.setStartTime(new Date());
		areaActivity.setQualifiedCostTime(areaSport.getQualifiedCostTime());

		areaActivityMapper.insertSelective(areaActivity);

		return areaActivity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wzsport.service.AreaActivityService#endAreaActivity(com.wzsport
	 * .model.AreaActivity)
	 */
	public AreaActivity endAreaActivity(AreaActivity areaActivity) {
		AreaActivity oldRecord = areaActivityMapper.selectByPrimaryKey(areaActivity.getId());

		if (oldRecord == null) {
			throw new DataRetrievalFailureException("找不到指定的记录");
		}

		if (oldRecord.getEndedAt() != null) {
			throw new RuntimeException("本次运动已经结束");
		}

		areaActivity.setAreaSportId(oldRecord.getAreaSportId());
		areaActivity.setStudentId(oldRecord.getStudentId());
		areaActivity.setStartTime(oldRecord.getStartTime());
		areaActivity.setQualifiedCostTime(oldRecord.getQualifiedCostTime());

		// 判断是否合格
		if (areaActivity.getCostTime() >= areaActivity.getQualifiedCostTime()) {
			areaActivity.setQualified(true);
		} else {
			areaActivity.setQualified(false);
		}

		// 获取关联的项目
		AreaSport areaSport = areaSportMapper.selectByPrimaryKey(areaActivity.getAreaSportId());

		// 计算卡路里消耗
		int caloriesConsumed = CalorieUtil.calculateCalorieConsumption(68, areaActivity.getCostTime(),
				areaSport.getHourlyKcalConsumption());
		areaActivity.setKcalConsumed(caloriesConsumed);

		areaActivity.setEndedAt(new Date());

		// 插入数据
		areaActivityMapper.updateByPrimaryKeySelective(areaActivity);

		return areaActivity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wzsport.service.AreaActivityService#
	 * getCurrentTermQualifiedActivityCount(long)
	 */
	@Override
	public int getCurrentTermQualifiedActivityCount(long studentId, long universityId) {
		Term term = termService.getCurrentTerm(universityId);
		if (term != null) {
			AreaActivityExample areaActivityExample = new AreaActivityExample();
			areaActivityExample.createCriteria().andStartTimeBetween(term.getStartDate(), term.getEndDate())
					.andStudentIdEqualTo(studentId).andQualifiedEqualTo(true);

			return (int) areaActivityMapper.countByExample(areaActivityExample);
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wzsport.service.AreaActivityService#getCurrentTermActivityCount(
	 * long, long)
	 */
	@Override
	public int getCurrentTermActivityCount(long studentId, long universityId) {
		Term term = termService.getCurrentTerm(universityId);
		if (term != null) {
			AreaActivityExample areaActivityExample = new AreaActivityExample();
			areaActivityExample.createCriteria().andStartTimeBetween(term.getStartDate(), term.getEndDate())
					.andStudentIdEqualTo(studentId);

			return (int) areaActivityMapper.countByExample(areaActivityExample);
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wzsport.service.AreaActivityService#getStudentCaloriesConsumption(
	 * long)
	 */
	@Override
	public int getStudentKCalConsumption(long studentId) {
		Integer caloriesConsumption = areaActivityMapper.sumCaloriesConsumedByStudentId(studentId);
		return caloriesConsumption == null ? 0 : caloriesConsumption;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wzsport.service.AreaActivityService#getStudentTimeCosted(long)
	 */
	@Override
	public int getStudentTimeCosted(long studentId) {
		Integer timeCosted = areaActivityMapper.sumCostTimeByStudentId(studentId);
		return timeCosted == null ? 0 : timeCosted;
	}

	/* (non-Javadoc)
	 * @see com.wzsport.service.AreaActivityService#getStudentCaloriesConsumption(long, java.util.Date, java.util.Date)
	 */
	@Override
	public int getStudentCaloriesConsumption(long studentId, Date start, Date end) {
		Integer timeCosted = areaActivityMapper.sumKCalConsumedByStudentIdAndDuration(studentId, start, end);
		return timeCosted == null ? 0 : timeCosted;
	}

	/* (non-Javadoc)
	 * @see com.wzsport.service.AreaActivityService#getStudentTimeCosted(long, java.util.Date, java.util.Date)
	 */
	@Override
	public int getStudentTimeCosted(long studentId, Date start, Date end) {
		Integer timeCosted = areaActivityMapper.sumCostTimeByStudentIdAndDuration(studentId, start, end);
		return timeCosted == null ? 0 : timeCosted;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wzsport.service.AreaActivityService#getQualifiedActivityCount(
	 * long, java.util.Date, java.util.Date)
	 */
	@Override
	public int getQualifiedActivityCount(long studentId, Date start, Date end) {
		AreaActivityExample areaActivityExample = new AreaActivityExample();
		Criteria criteria = areaActivityExample.createCriteria().andStudentIdEqualTo(studentId)
				.andQualifiedEqualTo(true);
		if (start != null) {
			criteria.andStartTimeGreaterThanOrEqualTo(start);
		}

		if (end != null) {
			criteria.andStartTimeLessThanOrEqualTo(end);
		}

		return (int) areaActivityMapper.countByExample(areaActivityExample);
	}

	/* (non-Javadoc)
	 * @see com.wzsport.service.AreaActivityService#getParticipantNum(long)
	 */
	@Override
	public int getParticipantNum(long areaSportId) {
		AreaActivityExample areaActivityExample = new AreaActivityExample();
		areaActivityExample.or().andAreaSportIdEqualTo(areaSportId).andEndedAtIsNull();
		return (int) areaActivityMapper.countByExample(areaActivityExample);
	}

	/* (non-Javadoc)
	 * @see com.wzsport.service.AreaActivityService#isActivityExist(long)
	 */
	@Override
	public boolean isActivityExist(long activityId) {
		if (areaActivityMapper.selectByPrimaryKey(activityId) != null) {
			return true;
		} else {
			return false;
		}
	}
}
