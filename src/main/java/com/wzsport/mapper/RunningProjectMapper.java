package com.wzsport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.RunningProject;

public interface RunningProjectMapper {

	/**
	* 获取所有RunningProject
	*/
	@Select("SELECT * FROM running_project")
	List<RunningProject> listAllRunningProject();
	
	
	/**
	* 根据id获取RunningProject
	* 
	* @param id
	*/
	@Select("SELECT * FROM running_project WHERE id = #{id}")
	RunningProject getRunningProjectById(int id);
	
	
	/**
	* 根据universityId获取所有相关联的RunningProject
	* 
	* @param universityId
	*/
	@Select("SELECT * FROM running_project WHERE university_id = #{universityId}")
	List<RunningProject> listRunningProjectByUniversityId(int universityId);
	
	
	/**
	* 更新项目的合格指标
	* 
	* @param id 主键
	* @param qualifiedDistance 合格距离
	* @param qualifiedCostTime 合格时间
	* @param minCostTime 最少耗时
	*/
	@Update("UPDATE running_project "
			+ "SET qualified_distance = #{qualifiedDistance}, "
			+ "qualified_cost_time = #{qualifiedCostTime}, "
			+ "min_cost_time = #{minCostTime} "
			+ "WHERE id = #{id}")
	int updateRunningProjectIndex(@Param("id") int id, @Param("qualifiedDistance") int qualifiedDistance, 
			@Param("qualifiedCostTime") int qualifiedCostTime,@Param("minCostTime") int minCostTime);
	
	
	/**
	* 更改RunningProject的enabled值
	* 
	* @param id
	* @param enabled 是否启用
	*/
	@Update("UPDATE running_project SET enabled = #{enabled} WHERE id = #{id}")
	int updateRunningProjectEnabled(@Param("id") int id, @Param("enabled") boolean enabled);
}
