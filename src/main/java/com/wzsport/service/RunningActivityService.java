package com.wzsport.service;

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
	* 获取一名学生本学期的有效活动次数
	* 
	* @param studentId 学生id
	* @param universityId 大学id
	*/
	int getCurrentTermQualifiedActivityCount(long studentId, long universityId);
	
	/**
	* 获取学生的卡路里消耗量
	* 
	* @param studentId
	*/
	int getStudentCaloriesConsumption(long studentId);
}
