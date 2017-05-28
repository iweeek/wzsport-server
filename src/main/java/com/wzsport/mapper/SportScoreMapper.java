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
			+ "student_id,meter50_sprint_time,meter50_sprint_score,"
			+ "standing_jump_distance,standing_jump_score,meter1500_run_time,meter1500_run_score,"
			+ "abdominal_curl_count,abdominal_curl_score)"
			+ "VALUES(#{studentId},#{meter50SprintTime},#{meter50SprintScore},"
			+ "#{standingJumpDistance},#{standingJumpScore},#{meter1500RunTime},#{meter1500RunScore},"
			+ "#{abdominalCurlCount},#{abdominalCurlScore})")
	@Options(useGeneratedKeys = true)
	int save(SportScore sportScore);
	
	/**
	 * 根据ID更新体育成绩
	 * @param sportScore
	 */
	int updateSportScoreById(SportScore sportScore);
	
}
