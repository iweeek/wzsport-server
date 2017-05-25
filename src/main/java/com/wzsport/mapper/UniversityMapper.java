package com.wzsport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.wzsport.model.University;


public interface UniversityMapper {

	/**
	* 根据id获取university
	* 
	* @param id
	*/
	@Select("SELECT * FROM university WHERE id = #{id}")
	University getUniversityById(int id);
	
	/**
	* 新增university
	* 
	* @param university
	*/
	@Insert("INSERT INTO university (name, created_at)"
			+ "VALUES (#{name}, #{createdAt})")
	int save(University university);
	
	/**
	* 根据id删除university
	* 
	* @param id
	*/
	@Delete("DELETE FROM university WHERE id=#{id}")  
    public void delete(int id);
	
	/**
	* 获取所有university
	*/
	@Select("SELECT * FROM university")
	List<University> listAllUniversity();
}
