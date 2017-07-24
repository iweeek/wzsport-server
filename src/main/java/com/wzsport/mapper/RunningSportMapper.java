package com.wzsport.mapper;

import com.wzsport.model.RunningSport;
import com.wzsport.model.RunningSportExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RunningSportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wzsport_running_sport
     *
     * @mbg.generated Mon Jul 24 14:49:23 CST 2017
     */
    long countByExample(RunningSportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wzsport_running_sport
     *
     * @mbg.generated Mon Jul 24 14:49:23 CST 2017
     */
    int deleteByExample(RunningSportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wzsport_running_sport
     *
     * @mbg.generated Mon Jul 24 14:49:23 CST 2017
     */
    @Delete({
        "delete from wzsport_running_sport",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wzsport_running_sport
     *
     * @mbg.generated Mon Jul 24 14:49:23 CST 2017
     */
    @Insert({
        "insert into wzsport_running_sport (university_id, name, ",
        "type, enabled, qualified_distance, ",
        "qualified_cost_time, min_cost_time, ",
        "hourly_kcal_consumption, acquisition_interval, ",
        "created_at, updated_at)",
        "values (#{universityId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{enabled,jdbcType=BIT}, #{qualifiedDistance,jdbcType=INTEGER}, ",
        "#{qualifiedCostTime,jdbcType=INTEGER}, #{minCostTime,jdbcType=INTEGER}, ",
        "#{hourlyKcalConsumption,jdbcType=INTEGER}, #{acquisitionInterval,jdbcType=TINYINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(RunningSport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wzsport_running_sport
     *
     * @mbg.generated Mon Jul 24 14:49:23 CST 2017
     */
    int insertSelective(RunningSport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wzsport_running_sport
     *
     * @mbg.generated Mon Jul 24 14:49:23 CST 2017
     */
    List<RunningSport> selectByExample(RunningSportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wzsport_running_sport
     *
     * @mbg.generated Mon Jul 24 14:49:23 CST 2017
     */
    @Select({
        "select",
        "id, university_id, name, type, enabled, qualified_distance, qualified_cost_time, ",
        "min_cost_time, hourly_kcal_consumption, acquisition_interval, created_at, updated_at",
        "from wzsport_running_sport",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.wzsport.mapper.RunningSportMapper.BaseResultMap")
    RunningSport selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wzsport_running_sport
     *
     * @mbg.generated Mon Jul 24 14:49:23 CST 2017
     */
    int updateByExampleSelective(@Param("record") RunningSport record, @Param("example") RunningSportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wzsport_running_sport
     *
     * @mbg.generated Mon Jul 24 14:49:23 CST 2017
     */
    int updateByExample(@Param("record") RunningSport record, @Param("example") RunningSportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wzsport_running_sport
     *
     * @mbg.generated Mon Jul 24 14:49:23 CST 2017
     */
    int updateByPrimaryKeySelective(RunningSport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wzsport_running_sport
     *
     * @mbg.generated Mon Jul 24 14:49:23 CST 2017
     */
    @Update({
        "update wzsport_running_sport",
        "set university_id = #{universityId,jdbcType=BIGINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "enabled = #{enabled,jdbcType=BIT},",
          "qualified_distance = #{qualifiedDistance,jdbcType=INTEGER},",
          "qualified_cost_time = #{qualifiedCostTime,jdbcType=INTEGER},",
          "min_cost_time = #{minCostTime,jdbcType=INTEGER},",
          "hourly_kcal_consumption = #{hourlyKcalConsumption,jdbcType=INTEGER},",
          "acquisition_interval = #{acquisitionInterval,jdbcType=TINYINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(RunningSport record);
}