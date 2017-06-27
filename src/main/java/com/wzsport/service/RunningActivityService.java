package com.wzsport.service;

import java.util.Date;

import com.wzsport.model.RunningActivity;

/**
* RunningActivity service interface.
* 
* @author x1ny
* @date 2017年5月26日
*/
public interface RunningActivityService {

	/**
	* 创建RunningActivity
	* 
	* @param runningActivity
	*/
	RunningActivity create(RunningActivity runningActivity);
	
	
	/**
	* 活动开始记录
	* 
	* @param studentId
	* @param projectId
	* @param startTime
	*/
	RunningActivity startRunningActivity(long studentId, long projectId, Date startTime);
	
	/**
	* 结束一次活动
	*/
	RunningActivity endRunningActivity(RunningActivity runningActivity);
	
	/**
	* 获取一名学生本学期的有效活动次数
	* 
	* @param studentId 学生id
	* @param universityId 大学id
	*/
	int getCurrentTermQualifiedActivityCount(long studentId, long universityId);
	
	/**
	* 获取一名学生指定时期内的有效活动次数
	* 
	* @param studentId 学生id
	* @param start 开始时期
	* @param end 结束时期 
	*/
	int getQualifiedActivityCount(long studentId, Date start, Date end);
	
	/**
	* 获取一名学生本学期的总活动次数
	* 
	* @param studentId 学生id
	* @param universityId 大学id
	*/
	int getCurrentTermActivityCount(long studentId, long universityId);
	
	/**
	* 获取学生的卡路里消耗量
	* 
	* @param studentId
	*/
	int getStudentCaloriesConsumption(long studentId);
	
	/**
	* 获取学生的累计运动时长
	* 
	* @param studentId
	*/
	int getStudentTimeCosted(long studentId);
	
	/**
	* 获取学生指定时段的卡路里消耗量
	* 
	* @param studentId
	* @param start 开始时期
	* @param end 结束时期
	*/
	int getStudentCaloriesConsumption(long studentId, Date start, Date end);
	
	/**
	* 获取学生指定时段的运动时长
	* 
	* @param studentId
	* @param start 开始时期
	* @param end 结束时期
	*/
	int getStudentTimeCosted(long studentId, Date start, Date end);
}
