package com.wzsport.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.TermSportsTask;
import com.wzsport.model.TermSportsTaskExample;

public interface TermSportsTaskMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term_sports_task
	 * @mbg.generated  Wed Jun 07 12:53:45 CST 2017
	 */
	long countByExample(TermSportsTaskExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term_sports_task
	 * @mbg.generated  Wed Jun 07 12:53:45 CST 2017
	 */
	int deleteByExample(TermSportsTaskExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term_sports_task
	 * @mbg.generated  Wed Jun 07 12:53:45 CST 2017
	 */
	@Delete({ "delete from wzsport_term_sports_task", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term_sports_task
	 * @mbg.generated  Wed Jun 07 12:53:45 CST 2017
	 */
	@Insert({ "insert into wzsport_term_sports_task (term_id, target_sports_times, ", "created_at, updated_at)",
			"values (#{termId,jdbcType=BIGINT}, #{targetSportsTimes,jdbcType=TINYINT}, ",
			"#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(TermSportsTask record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term_sports_task
	 * @mbg.generated  Wed Jun 07 12:53:45 CST 2017
	 */
	int insertSelective(TermSportsTask record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term_sports_task
	 * @mbg.generated  Wed Jun 07 12:53:45 CST 2017
	 */
	List<TermSportsTask> selectByExample(TermSportsTaskExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term_sports_task
	 * @mbg.generated  Wed Jun 07 12:53:45 CST 2017
	 */
	@Select({ "select", "id, term_id, target_sports_times, created_at, updated_at", "from wzsport_term_sports_task",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.TermSportsTaskMapper.BaseResultMap")
	TermSportsTask selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term_sports_task
	 * @mbg.generated  Wed Jun 07 12:53:45 CST 2017
	 */
	int updateByExampleSelective(@Param("record") TermSportsTask record,
			@Param("example") TermSportsTaskExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term_sports_task
	 * @mbg.generated  Wed Jun 07 12:53:45 CST 2017
	 */
	int updateByExample(@Param("record") TermSportsTask record, @Param("example") TermSportsTaskExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term_sports_task
	 * @mbg.generated  Wed Jun 07 12:53:45 CST 2017
	 */
	int updateByPrimaryKeySelective(TermSportsTask record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term_sports_task
	 * @mbg.generated  Wed Jun 07 12:53:45 CST 2017
	 */
	@Update({ "update wzsport_term_sports_task", "set term_id = #{termId,jdbcType=BIGINT},",
			"target_sports_times = #{targetSportsTimes,jdbcType=TINYINT},",
			"created_at = #{createdAt,jdbcType=TIMESTAMP},", "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(TermSportsTask record);
}