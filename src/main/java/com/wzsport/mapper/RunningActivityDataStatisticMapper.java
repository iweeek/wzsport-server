package com.wzsport.mapper;

import com.wzsport.model.RunningActivityDataStatistic;
import com.wzsport.model.RunningActivityDataStatisticExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RunningActivityDataStatisticMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    long countByExample(RunningActivityDataStatisticExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    int deleteByExample(RunningActivityDataStatisticExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    @Delete({ "delete from wzsport_running_activity_data_statistic", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    @Insert({ "insert into wzsport_running_activity_data_statistic (student_id, activity_id, ",
            "location_total_count, speed_against, ", "distance_per_step_against)",
            "values (#{studentId,jdbcType=BIGINT}, #{activityId,jdbcType=BIGINT}, ",
            "#{locationTotalCount,jdbcType=INTEGER}, #{speedAgainst,jdbcType=INTEGER}, ",
            "#{distancePerStepAgainst,jdbcType=INTEGER})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(RunningActivityDataStatistic record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    int insertSelective(RunningActivityDataStatistic record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    List<RunningActivityDataStatistic> selectByExample(RunningActivityDataStatisticExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    @Select({ "select", "id, student_id, activity_id, location_total_count, speed_against, distance_per_step_against",
            "from wzsport_running_activity_data_statistic", "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.wzsport.mapper.RunningActivityDataStatisticMapper.BaseResultMap")
    RunningActivityDataStatistic selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    int updateByExampleSelective(@Param("record") RunningActivityDataStatistic record,
            @Param("example") RunningActivityDataStatisticExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    int updateByExample(@Param("record") RunningActivityDataStatistic record,
            @Param("example") RunningActivityDataStatisticExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    int updateByPrimaryKeySelective(RunningActivityDataStatistic record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    @Update({ "update wzsport_running_activity_data_statistic", "set student_id = #{studentId,jdbcType=BIGINT},",
            "activity_id = #{activityId,jdbcType=BIGINT},",
            "location_total_count = #{locationTotalCount,jdbcType=INTEGER},",
            "speed_against = #{speedAgainst,jdbcType=INTEGER},",
            "distance_per_step_against = #{distancePerStepAgainst,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(RunningActivityDataStatistic record);
}