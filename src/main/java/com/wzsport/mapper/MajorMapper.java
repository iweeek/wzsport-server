package com.wzsport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.wzsport.model.Major;

public interface MajorMapper {

	/**
	* 根据id获取major
	* 
	* @param id
	*/
	@Select("SELECT * FROM major WHERE id = #{id}")
	Major getMajorById(int id);
	
	/**
	* 新增major
	*/
	@Insert("INSERT INTO major (college_id, university_id, name, created_at)"
			+ "VALUES (#{collegeId}, #{universityId}, #{name}, #{createdAt} )")
	int save(Major major);
	
	/**
	* 根据id删除major
	* 
	* @param id
	*/
	@Delete("DELETE FROM major WHERE id=#{id}")  
    void delete(int id);
	
	/**
	* 获取所有major
	*/
	@Select("SELECT * FROM major")
	List<Major> listAllMajor();
	
	/**
	* 根据collegeId获取所有相关联的major
	* 
	* @param collegeId
	*/
	@Select("SELECT * FROM major WHERE college_id = #{collegeId}")
	List<Major> listMajorByCollegeId(int collegeId);
}
