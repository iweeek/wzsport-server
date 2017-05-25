package com.wzsport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.wzsport.model.Class;

public interface ClassMapper {

	/**
	* 根据id获取班级
	* 
	* @param id
	*/
	@Select("SELECT * FROM class WHERE id = #{id}")
	Class getClassById(int id);
	
//	@Insert("INSERT INTO class (major_id, university_id, name, gradle, created_at)"
//			+ "VALUES (#{majorId}, #{universityId}, #{name}, #{gradle}, #{createdAt} )")
//	int save(Class studentClass);
	
	/**
	* 根据id删除
	* 
	* @param id
	*/
	@Delete("DELETE FROM class WHERE id=#{id}")  
    public void delete(int id); 
	
	/**
	* 获取所有班级
	*/
	@Select("SELECT * FROM class")
	List<Class> listAllClass();
	
	/**
	* 根据学院id获取所有相关联的班级
	* 
	* @param majorId 学院id
	*/
	@Select("SELECT * FROM class WHERE major_id = #{majorId}")
	List<Class> listClassByMajorId(int majorId);
	
	/**
	* 根据教师id获取所有相关联的班级
	* 
	* @param teacherId 教师id
	*/
	@Select("SELECT class.id AS id, "
			+ "class.major_id AS marjor_id, "
			+ "class.university_id AS university_id, "
			+ "class.name AS name, "
			+ "class.gradle AS gradle, "
			+ "class.created_at AS created_at "
			+ "FROM r_teacher_class "
			+ "JOIN class ON r_teacher_class.class_id = class.id "
			+ "WHERE r_teacher_class.teacher_id = #{teacherId}")
	List<Class> listClassByTeacherId(int teacherId);
}
