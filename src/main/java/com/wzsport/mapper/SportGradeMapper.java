package com.wzsport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.SportGrade;

public interface SportGradeMapper {
	
	/**
	 * 根据id获取体侧成绩
	 * @param id
	 * @return
	 */
	@Select("SELECT * FROM sport_grades WHERE id = #{id}")
	SportGrade getSportGradeById(Integer id);
	
	//TODO:删除
	
	/**
	 * 根据关联的学生id获取其体侧成绩
	 * @param stuId 学生Id
	 * @return 学生体测成绩集合
	 */
	@Select("SELECT * FROM sport_grades WHERE student_id = #{stuId}")
	List<SportGrade> listSportGradeByStuId(Integer stuId);
	
	
	/**
	 * 保存一条体测记录
	 * @param sportGrade 体测成绩对象
	 * @return
	 */
	@Insert("INSERT INTO "
			+ "sport_grades(student_id,height,weight,lung_capacity,BMI)"
			+ "VALUES(#{studentId},#{height},#{weight},#{lungCapacity},#{bmi})")
	@Options(useGeneratedKeys=true)
	int save(SportGrade sportGrade);
	
	/**
	 * 根据ID更新体测成绩
	 * @param sportGrade
	 */
	@Update("UPDATE sport_grades SET height = #{height}, weight = #{weight},"
			+ "lung_capacity = #{lungCapacity}, BMI = #{bmi} WHERE id = #{id}")
	void updateSportGradeById(SportGrade sportGrade);
	
}
