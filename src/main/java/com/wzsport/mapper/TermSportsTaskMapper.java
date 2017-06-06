package com.wzsport.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.wzsport.model.TermSportsTask;

/**
* TermSportsTask Mapper
* 
* @author x1ny
* @date 2017年6月6日
*/
public interface TermSportsTaskMapper {

	/**
	* 根据id获取TermSportsTask
	* 
	* @param id
	*/
	@Select("SELECT * FROM term_sports_task WHERE id = #{id}")
	TermSportsTask getTermSportsTaskById(int id);
	
	/**
	* 根据termId获取TermSportsTask
	* 
	* @param termId
	*/
	@Select("SELECT * FROM term_sports_task WHERE term_id = #{termId}")
	TermSportsTask getTermSportsTaskByTermId(int termId);
	
	
	/**
	* 新增TermSportsTask
	* 
	* @param termSportsTask
	*/
	@Insert("INSERT INTO term_sports_task (term_id, target_sports_times)"
			+ "VALUES (#{termId}, #{targetSportsTimes})")
	@Options(useGeneratedKeys=true)
	int save(TermSportsTask termSportsTask);
	
	
	/**
	* 更新TermSportsTask
	* 
	* @param termSportsTask
	*/
	int update(TermSportsTask termSportsTask);
	
	/**
	* 根据id删除termSportsTask
	* 
	* @param id
	*/
	@Delete("DELETE FROM term_sports_task WHERE id=#{id}")  
    public int delete(int id);
	
	/**
	* 根据termId删除termSportsTask
	* 
	* @param termId
	*/
	@Delete("DELETE FROM term_sports_task WHERE term_id = #{termId}")  
    public int deleteByTermId(int termId); 
}
