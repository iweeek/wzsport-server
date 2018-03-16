package com.wzsport.mapper;

import com.wzsport.model.RunningActivityData;
import com.wzsport.model.RunningActivityDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RunningActivityDataMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Fri Mar 16 17:44:40 CST 2018
	 */
	long countByExample(RunningActivityDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Fri Mar 16 17:44:40 CST 2018
	 */
	int deleteByExample(RunningActivityDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Fri Mar 16 17:44:40 CST 2018
	 */
	@Delete({ "delete from wzsport_running_activity_data", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Fri Mar 16 17:44:40 CST 2018
	 */
	@Insert({ "insert into wzsport_running_activity_data (activity_id, acquisition_time, ",
			"step_count, step_count_cal, ", "distance, distance_per_step, ", "step_per_second, longitude, ",
			"latitude, location_type, ", "is_normal)",
			"values (#{activityId,jdbcType=BIGINT}, #{acquisitionTime,jdbcType=TIMESTAMP}, ",
			"#{stepCount,jdbcType=SMALLINT}, #{stepCountCal,jdbcType=SMALLINT}, ",
			"#{distance,jdbcType=SMALLINT}, #{distancePerStep,jdbcType=DECIMAL}, ",
			"#{stepPerSecond,jdbcType=DECIMAL}, #{longitude,jdbcType=DECIMAL}, ",
			"#{latitude,jdbcType=DECIMAL}, #{locationType,jdbcType=TINYINT}, ", "#{isNormal,jdbcType=BIT})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(RunningActivityData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Fri Mar 16 17:44:40 CST 2018
	 */
	int insertSelective(RunningActivityData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Fri Mar 16 17:44:40 CST 2018
	 */
	List<RunningActivityData> selectByExample(RunningActivityDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Fri Mar 16 17:44:40 CST 2018
	 */
	@Select({ "select", "id, activity_id, acquisition_time, step_count, step_count_cal, distance, distance_per_step, ",
			"step_per_second, longitude, latitude, location_type, is_normal", "from wzsport_running_activity_data",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.RunningActivityDataMapper.BaseResultMap")
	RunningActivityData selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Fri Mar 16 17:44:40 CST 2018
	 */
	int updateByExampleSelective(@Param("record") RunningActivityData record,
			@Param("example") RunningActivityDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Fri Mar 16 17:44:40 CST 2018
	 */
	int updateByExample(@Param("record") RunningActivityData record,
			@Param("example") RunningActivityDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Fri Mar 16 17:44:40 CST 2018
	 */
	int updateByPrimaryKeySelective(RunningActivityData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Fri Mar 16 17:44:40 CST 2018
	 */
	@Update({ "update wzsport_running_activity_data", "set activity_id = #{activityId,jdbcType=BIGINT},",
			"acquisition_time = #{acquisitionTime,jdbcType=TIMESTAMP},", "step_count = #{stepCount,jdbcType=SMALLINT},",
			"step_count_cal = #{stepCountCal,jdbcType=SMALLINT},", "distance = #{distance,jdbcType=SMALLINT},",
			"distance_per_step = #{distancePerStep,jdbcType=DECIMAL},",
			"step_per_second = #{stepPerSecond,jdbcType=DECIMAL},", "longitude = #{longitude,jdbcType=DECIMAL},",
			"latitude = #{latitude,jdbcType=DECIMAL},", "location_type = #{locationType,jdbcType=TINYINT},",
			"is_normal = #{isNormal,jdbcType=BIT}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(RunningActivityData record);
}