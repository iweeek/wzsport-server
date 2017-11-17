package com.wzsport.mapper;

import com.wzsport.model.AreaSport;
import com.wzsport.model.AreaSportExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface AreaSportMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
<<<<<<< HEAD
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
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    long countByExample(AreaSportExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
<<<<<<< HEAD
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
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    int deleteByExample(AreaSportExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
<<<<<<< HEAD
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
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    @Delete({ "delete from wzsport_area_sport", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
<<<<<<< HEAD
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
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    @Insert({ "insert into wzsport_area_sport (name, is_enabled, ", "is_man, qualified_cost_time, ",
            "img_url, sample_num, ", "hourly_kcal_consumption, acquisition_interval, ", "university_id)",
            "values (#{name,jdbcType=VARCHAR}, #{isEnabled,jdbcType=BIT}, ",
            "#{isMan,jdbcType=TINYINT}, #{qualifiedCostTime,jdbcType=INTEGER}, ",
            "#{imgUrl,jdbcType=VARCHAR}, #{sampleNum,jdbcType=TINYINT}, ",
            "#{hourlyKcalConsumption,jdbcType=INTEGER}, #{acquisitionInterval,jdbcType=TINYINT}, ",
            "#{universityId,jdbcType=BIGINT})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(AreaSport record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
<<<<<<< HEAD
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
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    int insertSelective(AreaSport record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
<<<<<<< HEAD
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
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    List<AreaSport> selectByExample(AreaSportExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
<<<<<<< HEAD
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
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    @Select({ "select",
            "id, name, is_enabled, is_man, qualified_cost_time, img_url, sample_num, hourly_kcal_consumption, ",
            "acquisition_interval, university_id", "from wzsport_area_sport", "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.wzsport.mapper.AreaSportMapper.BaseResultMap")
    AreaSport selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
<<<<<<< HEAD
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
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    int updateByExampleSelective(@Param("record") AreaSport record, @Param("example") AreaSportExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
<<<<<<< HEAD
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
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    int updateByExample(@Param("record") AreaSport record, @Param("example") AreaSportExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
<<<<<<< HEAD
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
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    int updateByPrimaryKeySelective(AreaSport record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
<<<<<<< HEAD
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
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    @Update({ "update wzsport_area_sport", "set name = #{name,jdbcType=VARCHAR},",
            "is_enabled = #{isEnabled,jdbcType=BIT},", "is_man = #{isMan,jdbcType=TINYINT},",
            "qualified_cost_time = #{qualifiedCostTime,jdbcType=INTEGER},", "img_url = #{imgUrl,jdbcType=VARCHAR},",
            "sample_num = #{sampleNum,jdbcType=TINYINT},",
            "hourly_kcal_consumption = #{hourlyKcalConsumption,jdbcType=INTEGER},",
            "acquisition_interval = #{acquisitionInterval,jdbcType=TINYINT},",
            "university_id = #{universityId,jdbcType=BIGINT}", "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(AreaSport record);
}