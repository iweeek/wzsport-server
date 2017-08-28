package com.wzsport.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.FitnessCheckData;
import com.wzsport.model.FitnessCheckDataExample;

public interface FitnessCheckDataMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Sun Aug 27 19:35:00 CST 2017
	 */
	long countByExample(FitnessCheckDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Sun Aug 27 19:35:00 CST 2017
	 */
	int deleteByExample(FitnessCheckDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Sun Aug 27 19:35:00 CST 2017
	 */
	@Delete({ "delete from wzsport_fitness_check_data", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Sun Aug 27 19:35:00 CST 2017
	 */
	@Insert({ "insert into wzsport_fitness_check_data (student_id, term_id, ", "height, weight, ",
			"lung_capacity, BMI, ", "created_at, updated_at)",
			"values (#{studentId,jdbcType=BIGINT}, #{termId,jdbcType=BIGINT}, ",
			"#{height,jdbcType=INTEGER}, #{weight,jdbcType=INTEGER}, ",
			"#{lungCapacity,jdbcType=INTEGER}, #{bmi,jdbcType=DECIMAL}, ",
			"#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(FitnessCheckData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Sun Aug 27 19:35:00 CST 2017
	 */
	int insertSelective(FitnessCheckData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Sun Aug 27 19:35:00 CST 2017
	 */
	List<FitnessCheckData> selectByExample(FitnessCheckDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Sun Aug 27 19:35:00 CST 2017
	 */
	@Select({ "select", "id, student_id, term_id, height, weight, lung_capacity, BMI, created_at, updated_at",
			"from wzsport_fitness_check_data", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.FitnessCheckDataMapper.BaseResultMap")
	FitnessCheckData selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Sun Aug 27 19:35:00 CST 2017
	 */
	int updateByExampleSelective(@Param("record") FitnessCheckData record,
			@Param("example") FitnessCheckDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Sun Aug 27 19:35:00 CST 2017
	 */
	int updateByExample(@Param("record") FitnessCheckData record, @Param("example") FitnessCheckDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Sun Aug 27 19:35:00 CST 2017
	 */
	int updateByPrimaryKeySelective(FitnessCheckData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Sun Aug 27 19:35:00 CST 2017
	 */
	@Update({ "update wzsport_fitness_check_data", "set student_id = #{studentId,jdbcType=BIGINT},",
			"term_id = #{termId,jdbcType=BIGINT},", "height = #{height,jdbcType=INTEGER},",
			"weight = #{weight,jdbcType=INTEGER},", "lung_capacity = #{lungCapacity,jdbcType=INTEGER},",
			"BMI = #{bmi,jdbcType=DECIMAL},", "created_at = #{createdAt,jdbcType=TIMESTAMP},",
			"updated_at = #{updatedAt,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(FitnessCheckData record);
}