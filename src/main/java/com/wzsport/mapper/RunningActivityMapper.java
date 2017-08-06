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
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	long countByExample(RunningActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	int deleteByExample(RunningActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	@Delete({ "delete from wzsport_running_activity", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	@Insert({ "insert into wzsport_running_activity (running_sport_id, student_id, ", "distance, step_count, ",
			"cost_time, speed, ", "step_per_second, distance_per_step, ", "target_finished_time, start_time, ",
			"kcal_consumed, qualified, ", "qualified_distance, qualified_cost_time, ", "min_cost_time, created_at, ",
			"updated_at, ended_at, ", "ended_by)",
			"values (#{runningSportId,jdbcType=BIGINT}, #{studentId,jdbcType=BIGINT}, ",
			"#{distance,jdbcType=INTEGER}, #{stepCount,jdbcType=SMALLINT}, ",
			"#{costTime,jdbcType=INTEGER}, #{speed,jdbcType=DECIMAL}, ",
			"#{stepPerSecond,jdbcType=DECIMAL}, #{distancePerStep,jdbcType=DECIMAL}, ",
			"#{targetFinishedTime,jdbcType=INTEGER}, #{startTime,jdbcType=TIMESTAMP}, ",
			"#{kcalConsumed,jdbcType=INTEGER}, #{qualified,jdbcType=BIT}, ",
			"#{qualifiedDistance,jdbcType=INTEGER}, #{qualifiedCostTime,jdbcType=INTEGER}, ",
			"#{minCostTime,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP}, ",
			"#{updatedAt,jdbcType=TIMESTAMP}, #{endedAt,jdbcType=TIMESTAMP}, ", "#{endedBy,jdbcType=TINYINT})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(RunningActivity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	int insertSelective(RunningActivity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	List<RunningActivity> selectByExample(RunningActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	@Select({ "select", "id, running_sport_id, student_id, distance, step_count, cost_time, speed, step_per_second, ",
			"distance_per_step, target_finished_time, start_time, kcal_consumed, qualified, ",
			"qualified_distance, qualified_cost_time, min_cost_time, created_at, updated_at, ", "ended_at, ended_by",
			"from wzsport_running_activity", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.RunningActivityMapper.BaseResultMap")
	RunningActivity selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	int updateByExampleSelective(@Param("record") RunningActivity record,
			@Param("example") RunningActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	int updateByExample(@Param("record") RunningActivity record, @Param("example") RunningActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	int updateByPrimaryKeySelective(RunningActivity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	@Update({ "update wzsport_running_activity", "set running_sport_id = #{runningSportId,jdbcType=BIGINT},",
			"student_id = #{studentId,jdbcType=BIGINT},", "distance = #{distance,jdbcType=INTEGER},",
			"step_count = #{stepCount,jdbcType=SMALLINT},", "cost_time = #{costTime,jdbcType=INTEGER},",
			"speed = #{speed,jdbcType=DECIMAL},", "step_per_second = #{stepPerSecond,jdbcType=DECIMAL},",
			"distance_per_step = #{distancePerStep,jdbcType=DECIMAL},",
			"target_finished_time = #{targetFinishedTime,jdbcType=INTEGER},",
			"start_time = #{startTime,jdbcType=TIMESTAMP},", "kcal_consumed = #{kcalConsumed,jdbcType=INTEGER},",
			"qualified = #{qualified,jdbcType=BIT},", "qualified_distance = #{qualifiedDistance,jdbcType=INTEGER},",
			"qualified_cost_time = #{qualifiedCostTime,jdbcType=INTEGER},",
			"min_cost_time = #{minCostTime,jdbcType=INTEGER},", "created_at = #{createdAt,jdbcType=TIMESTAMP},",
			"updated_at = #{updatedAt,jdbcType=TIMESTAMP},", "ended_at = #{endedAt,jdbcType=TIMESTAMP},",
			"ended_by = #{endedBy,jdbcType=TINYINT}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(RunningActivity record);

	@Select("SELECT SUM(kcal_consumed) FROM wzsport_running_activity WHERE student_id = #{studentId}")
	Integer sumCaloriesConsumedByStudentId(long studentId);
	
	@Select("SELECT SUM(cost_time) FROM wzsport_running_activity WHERE student_id = #{studentId}")
	Integer sumCostTimeByStudentId(long studentId);
	
	@Select("SELECT SUM(kcal_consumed) "
			+ "FROM wzsport_running_activity "
			+ "WHERE student_id = #{studentId} AND start_time > #{start} AND start_time < #{end}")
	Integer sumKCalConsumedByStudentIdAndDuration(@Param("studentId") long studentId,@Param("start") Date start,@Param("end")  Date end);
	
	@Select("SELECT SUM(cost_time) "
			+ "FROM wzsport_running_activity "
			+ "WHERE student_id = #{studentId} AND start_time > #{start} AND start_time < #{end}")
	Integer sumCostTimeByStudentIdAndDuration(@Param("studentId") long studentId,@Param("start")  Date start,@Param("end")  Date end);
}