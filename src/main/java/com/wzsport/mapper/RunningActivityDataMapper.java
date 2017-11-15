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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
     */
    long countByExample(RunningActivityDataExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
     */
    int deleteByExample(RunningActivityDataExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
     */
    @Delete({ "delete from wzsport_running_activity_data", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
     */
    int insertSelective(RunningActivityData record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
     */
    List<RunningActivityData> selectByExample(RunningActivityDataExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
     */
    @Select({ "select", "id, activity_id, acquisition_time, step_count, step_count_cal, distance, distance_per_step, ",
            "step_per_second, longitude, latitude, location_type, is_normal", "from wzsport_running_activity_data",
            "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.wzsport.mapper.RunningActivityDataMapper.BaseResultMap")
    RunningActivityData selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
     */
    int updateByExampleSelective(@Param("record") RunningActivityData record,
            @Param("example") RunningActivityDataExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
     */
    int updateByExample(@Param("record") RunningActivityData record,
            @Param("example") RunningActivityDataExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
     */
    int updateByPrimaryKeySelective(RunningActivityData record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
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