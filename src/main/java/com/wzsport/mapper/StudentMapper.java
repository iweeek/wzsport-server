package com.wzsport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.wzsport.model.Student;

public interface StudentMapper {

	/**
	* 根据id获取student
	* 
	* @param id
	*/
	@Select("SELECT * FROM student WHERE id = #{id}")
	@Results(value ={
            @Result(property="man",column="is_man")
            })
	Student getStudentById(int id);
	
	/**
	* 根据userId获取student
	* 
	* @param userId
	*/
	@Select("SELECT * FROM student WHERE user_id = #{userId}")
	@Results(value ={
            @Result(property="man",column="is_man")
            })
	Student getStudentByUserId(int userId);
	
	/**
	* 新增student
	*/
	@Insert("INSERT INTO student (user_id, class_id, university_id, student_no, is_man, name, created_at)"
			+ "VALUES (#{userId}, #{classId}, #{universityId}, #{studentNo}, #{man}, #{name}, #{createdAt} )")
	@Options(useGeneratedKeys=true)
	int save(Student student);
	
	/**
	* 根据id删除student
	* 
	* @param id
	*/
	@Delete("DELETE FROM student WHERE id = #{id}")  
    public void delete(int id); 
	
	/**
	* 获取所有student
	*/
	@Select("SELECT * FROM student")
	List<Student> listAllStudent();
	
	/**
	* 根据classId获取所有相关联的student
	* 
	* @param classId
	*/
	@Select("SELECT * FROM student WHERE class_id = #{classId}")
	List<Student> listStudentByClassId(int classId);
}
