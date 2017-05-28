package com.wzsport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.wzsport.model.SportScore;
/**
 * 体育成绩类
 * @author linhongyong
 * 
 * 2017年5月27日
 */

public interface SportScoreMapper {
	/**
	 * 根据id获取体育成绩
	 * @param id
	 * @return
	 */
	@Select("SELECT * FROM sport_score WHERE id = #{id}")
	SportScore getSportScoreById(Integer id);
	
	//TODO:删除
	
	/**
	 * 根据关联的学生id获取其体育成绩
	 * @param stuId 学生Id
	 * @return 学生体育成绩集合
	 */
	@Select("SELECT * FROM sport_score WHERE student_id = #{studentId}")
	List<SportScore> listSportScoreByStudentId(Integer studentId);
	
	
	/**
	 * 保存一条体育成绩记录
	 * @param SportScore 体育成绩对象
	 * @return
	 */
	@Insert("INSERT INTO "
			+ "sport_score("
			+ "student_id,meter_50_sprint,meter_50_sprint_score,"
			+ "standing_jump,standing_jump_score,meter_1500_run,meter_1500_run_score,"
			+ "abdominal_curl,abdominal_curl_score)"
			+ "VALUES(#{studentId},#{meter50Sprint},#{meter50SprintScore},"
			+ "#{standingJump},#{standingJumpScore},#{meter1500Run},#{meter1500RunScore},"
			+ "#{abdominalCurl},#{abdominalCurlScore})")
	@Options(useGeneratedKeys=true)
	int save(SportScore sportScore);
	
	/**
	 * 根据ID更新体育成绩
	 * @param sportScore
	 */
	/*@Update("UPDATE sport_score SET "
			+ "meter_50_sprint = #{meter50Sprint}, meter_50_sprint_score = #{meter50SprintScore},"
			+ "standing_jump = #{standingJump}, standing_jump_score = #{standingJumpScore}, "
			+ "meter_1500_run = #{meter1500Run}, meter_1500_run_score = #{meter1500RunScore} ,"
			+ "abdominal_curl = #{abdominalCurl}, abdominal_curl_score = #{abdominalCurlScore} "
			+ "WHERE id = #{id}")*/
	int updateSportScoreById(SportScore sportScore);
	
}
