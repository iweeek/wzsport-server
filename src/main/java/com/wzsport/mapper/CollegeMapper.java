package com.wzsport.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.College;
import com.wzsport.model.CollegeExample;

public interface CollegeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
	 * @mbg.generated  Fri Jun 16 10:13:10 CST 2017
	 */
	long countByExample(CollegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
	 * @mbg.generated  Fri Jun 16 10:13:10 CST 2017
	 */
	int deleteByExample(CollegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
	 * @mbg.generated  Fri Jun 16 10:13:10 CST 2017
	 */
	@Delete({ "delete from wzsport_college", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
	 * @mbg.generated  Fri Jun 16 10:13:10 CST 2017
	 */
	@Insert({ "insert into wzsport_college (university_id, name, ", "created_at, updated_at)",
			"values (#{universityId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
			"#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(College record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
	 * @mbg.generated  Fri Jun 16 10:13:10 CST 2017
	 */
	int insertSelective(College record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
	 * @mbg.generated  Fri Jun 16 10:13:10 CST 2017
	 */
	List<College> selectByExample(CollegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
	 * @mbg.generated  Fri Jun 16 10:13:10 CST 2017
	 */
	@Select({ "select", "id, university_id, name, created_at, updated_at", "from wzsport_college",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.CollegeMapper.BaseResultMap")
	College selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
	 * @mbg.generated  Fri Jun 16 10:13:10 CST 2017
	 */
	int updateByExampleSelective(@Param("record") College record, @Param("example") CollegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
	 * @mbg.generated  Fri Jun 16 10:13:10 CST 2017
	 */
	int updateByExample(@Param("record") College record, @Param("example") CollegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
	 * @mbg.generated  Fri Jun 16 10:13:10 CST 2017
	 */
	int updateByPrimaryKeySelective(College record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
	 * @mbg.generated  Fri Jun 16 10:13:10 CST 2017
	 */
	@Update({ "update wzsport_college", "set university_id = #{universityId,jdbcType=BIGINT},",
			"name = #{name,jdbcType=VARCHAR},", "created_at = #{createdAt,jdbcType=TIMESTAMP},",
			"updated_at = #{updatedAt,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(College record);
}