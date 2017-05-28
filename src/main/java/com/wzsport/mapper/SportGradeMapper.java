package com.wzsport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.FitnessCheckData;
import com.wzsport.model.SportGrade;
/**
 * 体育成绩类
 * @author linhongyong
 * 2017年5月27日
 */
public interface SportGradeMapper {
	/**
	 * 根据id获取体育成绩
	 * @param id
	 * @return
	 */
	@Select("SELECT * FROM sport_grade WHERE id = #{id}")
	SportGrade getSportGradeById(Integer id);
	
	//TODO:删除
	
	/**
	 * 根据关联的学生id获取其体育成绩
	 * @param stuId 学生Id
	 * @return 学生体育成绩集合
	 */
	@Select("SELECT * FROM sport_grade WHERE student_id = #{studentId}")
	List<SportGrade> listSportGradeByStudentId(Integer studentId);
	
	
	/**
	 * 保存一条体育成绩记录
	 * @param SportGrade 体育成绩对象
	 * @return
	 */
	@Insert("INSERT INTO "
			+ "sport_grade("
			+ "student_id,meter50,meter50_grade,"
			+ "standing_jump,standing_jump_grade,meter1500,meter1500_grade,"
			+ "abdominal_curl,abdominal_curl_grade)"
			+ "VALUES(#{studentId},#{meter50},#{meter50Grade},"
			+ "#{standingJump},#{standingJumpGrade},#{meter1500},#{meter1500Grade},"
			+ "#{abdominalCurl},#{abdominalCurlGrade})")
	@Options(useGeneratedKeys=true)
	int save(SportGrade sportGrade);
	
	/**
	 * 根据ID更新体育成绩
	 * @param sportGrade
	 */
	@Update("UPDATE sport_grade SET "
			+ "meter50 = #{meter50}, meter50_grade = #{meter50Grade},"
			+ "standing_jump = #{standingJump}, standing_jump_grade = #{standingJumpGrade}, "
			+ "meter1500 = #{meter1500}, meter1500_grade = #{meter1500Grade} ,"
			+ "abdominal_curl = #{abdominalCurl}, abdominal_curl_grade = #{abdominalCurlGrade} "
			+ "WHERE id = #{id}")
	void updateSportGradeById(SportGrade sportGrade);
	
}
