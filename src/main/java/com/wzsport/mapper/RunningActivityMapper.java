package com.wzsport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.wzsport.model.RunningActivity;

public interface RunningActivityMapper {

	/**
	* 根据id获取RunningActivity
	* 
	* @param id
	*/
	@Select("SELECT * FROM running_activity WHERE id = #{id}")
	RunningActivity getRunningActivityById(int id);
	
	/**
	* 根据studentId获取所有相关联的RunningActivity
	* 
	* @param studentId
	*/
	@Select("SELECT * FROM running_activity WHERE student_id = #{id}")
	List<RunningActivity> listRunningActivityByStudentId(int studentId);
	
	/**
	* 新增RunningActivity
	* 
	* @param runningActivity
	*/
	@Insert("INSERT INTO running_activity (project_id, student_id, distance, cost_time, target_time, start_time, cost_calorie, qualified) "
			+ "VALUES (#{projectId}, #{studentId}, #{distance}, #{costTime}, #{targetTime}, #{startTime}, #{costCalorie}, #{qualified})")
	@Options(useGeneratedKeys=true)
	int save(RunningActivity runningActivity);
}
