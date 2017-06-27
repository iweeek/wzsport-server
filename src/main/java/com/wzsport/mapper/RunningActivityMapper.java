package com.wzsport.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.RunningActivity;
import com.wzsport.model.RunningActivityExample;

public interface RunningActivityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 27 16:11:55 CST 2017
	 */
	long countByExample(RunningActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 27 16:11:55 CST 2017
	 */
	int deleteByExample(RunningActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 27 16:11:55 CST 2017
	 */
	@Delete({ "delete from wzsport_running_activity", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 27 16:11:55 CST 2017
	 */
	@Insert({ "insert into wzsport_running_activity (project_id, student_id, ", "distance, step_count, ",
			"cost_time, speed, ", "step_per_second, distance_per_step, ", "target_time, start_time, ",
			"calories_consumed, qualified, ", "ended, created_at, ", "updated_at)",
			"values (#{projectId,jdbcType=BIGINT}, #{studentId,jdbcType=BIGINT}, ",
			"#{distance,jdbcType=INTEGER}, #{stepCount,jdbcType=SMALLINT}, ",
			"#{costTime,jdbcType=INTEGER}, #{speed,jdbcType=DECIMAL}, ",
			"#{stepPerSecond,jdbcType=DECIMAL}, #{distancePerStep,jdbcType=DECIMAL}, ",
			"#{targetTime,jdbcType=INTEGER}, #{startTime,jdbcType=TIMESTAMP}, ",
			"#{caloriesConsumed,jdbcType=INTEGER}, #{qualified,jdbcType=BIT}, ",
			"#{ended,jdbcType=BIT}, #{createdAt,jdbcType=TIMESTAMP}, ", "#{updatedAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(RunningActivity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 27 16:11:55 CST 2017
	 */
	int insertSelective(RunningActivity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 27 16:11:55 CST 2017
	 */
	List<RunningActivity> selectByExample(RunningActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 27 16:11:55 CST 2017
	 */
	@Select({ "select", "id, project_id, student_id, distance, step_count, cost_time, speed, step_per_second, ",
			"distance_per_step, target_time, start_time, calories_consumed, qualified, ended, ",
			"created_at, updated_at", "from wzsport_running_activity", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.RunningActivityMapper.BaseResultMap")
	RunningActivity selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 27 16:11:55 CST 2017
	 */
	int updateByExampleSelective(@Param("record") RunningActivity record,
			@Param("example") RunningActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 27 16:11:55 CST 2017
	 */
	int updateByExample(@Param("record") RunningActivity record, @Param("example") RunningActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 27 16:11:55 CST 2017
	 */
	int updateByPrimaryKeySelective(RunningActivity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 27 16:11:55 CST 2017
	 */
	@Update({ "update wzsport_running_activity", "set project_id = #{projectId,jdbcType=BIGINT},",
			"student_id = #{studentId,jdbcType=BIGINT},", "distance = #{distance,jdbcType=INTEGER},",
			"step_count = #{stepCount,jdbcType=SMALLINT},", "cost_time = #{costTime,jdbcType=INTEGER},",
			"speed = #{speed,jdbcType=DECIMAL},", "step_per_second = #{stepPerSecond,jdbcType=DECIMAL},",
			"distance_per_step = #{distancePerStep,jdbcType=DECIMAL},", "target_time = #{targetTime,jdbcType=INTEGER},",
			"start_time = #{startTime,jdbcType=TIMESTAMP},",
			"calories_consumed = #{caloriesConsumed,jdbcType=INTEGER},", "qualified = #{qualified,jdbcType=BIT},",
			"ended = #{ended,jdbcType=BIT},", "created_at = #{createdAt,jdbcType=TIMESTAMP},",
			"updated_at = #{updatedAt,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(RunningActivity record);

	@Select("SELECT SUM(calories_consumed) FROM wzsport_running_activity WHERE student_id = #{studentId}")
	Integer sumCaloriesConsumedByStudentId(long studentId);
	
	@Select("SELECT SUM(cost_time) FROM wzsport_running_activity WHERE student_id = #{studentId}")
	Integer sumCostTimeByStudentId(long studentId);
	
	@Select("SELECT SUM(calories_consumed) "
			+ "FROM wzsport_running_activity "
			+ "WHERE student_id = #{studentId} AND start_time > #{start} AND start_time < #{end}")
	Integer sumCaloriesConsumedByStudentIdAndDuration(@Param("studentId") long studentId,@Param("start") Date start,@Param("end")  Date end);
	
	@Select("SELECT SUM(cost_time) "
			+ "FROM wzsport_running_activity "
			+ "WHERE student_id = #{studentId} AND start_time > #{start} AND start_time < #{end}")
	Integer sumCostTimeByStudentIdAndDuration(@Param("studentId") long studentId,@Param("start")  Date start,@Param("end")  Date end);
}