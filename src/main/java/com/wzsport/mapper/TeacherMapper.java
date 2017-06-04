package com.wzsport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.wzsport.model.Teacher;
import com.wzsport.sqlproviders.TeacherDynaSqlProvider;

public interface TeacherMapper {

	/**
	* 根据id获取teacher
	* 
	* @param id
	*/
	@Select("SELECT * FROM teacher WHERE id = #{id}")
	@Results(value ={
            @Result(property="man",column="is_man")
            })
	Teacher getTeacherById(int id);
	
	/**
	* 新增teacher
	* 
	* @param teacher
	*/
	@Insert("INSERT INTO teacher (university_id, name, is_man, created_at)"
			+ "VALUES (#{universityId}, #{name}, #{man}, #{createdAt} )")
	@Options(useGeneratedKeys=true)
	int save(Teacher teacher);
	
	/**
	* 根据id删除teacher
	* 
	* @param id
	*/
	@Delete("DELETE FROM teacher WHERE id=#{id}")  
    public void delete(int id); 
	
	/**
	* 获取所有teacher
	*/
	@Select("SELECT * FROM teacher")
	List<Teacher> listAllTeacher();
	
	/**
	 * 获取所有老师的数量
	 * 
	 * @return
	 */
	@Select("SELECT count(id) FROM teacher WHERE university_id=#{universityId}")
	int countAllTeachers(Integer universityId);
	
	/**
	 * 
	 */
	@SelectProvider(type=TeacherDynaSqlProvider.class,method="getDifferentSexTeachersCount")
	int countDifferentSexTeachers(Integer universutyId,Boolean sex);
	
	
	@SelectProvider(type=TeacherDynaSqlProvider.class,method="listTeacherByIdAndNameAndSex")
	List<Teacher> listTeacherByIdAndNameAndSex(String jobNo, String name, Boolean sex);
	/**
	* 根据classId获取所有相关联的teacher
	* 
	* @param classId
	*/
	@Select("SELECT teacher.id AS id, "
			+ "teacher.university_id AS university_id, "
			+ "teacher.name AS name, "
			+ "teacher.job_no AS job_no, "
			+ "teacher.is_man AS man, "
			+ "teacher.created_at AS created_at "
			+ "FROM r_teacher_class "
			+ "JOIN teacher ON r_teacher_class.teacher_id = teacher.id "
			+ "WHERE r_teacher_class.class_id = #{classId}")
	List<Teacher> listTeacherByClassId(int classId);
}
