package com.wzsport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.wzsport.model.College;

public interface CollegeMapper {

	/**
	* 根据id获取college
	* 
	* @param id
	*/
	@Select("SELECT * FROM college WHERE id = #{id}")
	College getCollegeById(int id);
	
	/**
	* 新增college
	* 
	* @param college
	*/
	@Insert("INSERT INTO college (university_id, name, created_at)"
			+ "VALUES (#{universityId}, #{name}, #{createdAt} )")
	int save(College college);
	
	/**
	* 根据id删除college
	* 
	* @param id
	*/
	@Delete("DELETE FROM college WHERE id=#{id}")  
    public void delete(int id); 
	
	/**
	* 获取所有college
	*/
	@Select("SELECT * FROM college")
	List<College> listAllCollege();
	
	/**
	* 根据universityId获取所有相关联的college
	* 
	* @param universityId
	*/
	@Select("SELECT * FROM college WHERE university_id = #{universityId}")
	List<College> listCollegeByUniversityId(int universityId);
}
