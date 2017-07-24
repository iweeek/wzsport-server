package com.wzsport.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.Class;
import com.wzsport.model.ClassExample;

public interface ClassMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
	 * @mbg.generated  Mon Jul 24 14:49:23 CST 2017
	 */
	long countByExample(ClassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
	 * @mbg.generated  Mon Jul 24 14:49:23 CST 2017
	 */
	int deleteByExample(ClassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
	 * @mbg.generated  Mon Jul 24 14:49:23 CST 2017
	 */
	@Delete({ "delete from wzsport_class", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
	 * @mbg.generated  Mon Jul 24 14:49:23 CST 2017
	 */
	@Insert({ "insert into wzsport_class (major_id, university_id, ", "name, grade, created_at, ", "updated_at)",
			"values (#{majorId,jdbcType=BIGINT}, #{universityId,jdbcType=BIGINT}, ",
			"#{name,jdbcType=VARCHAR}, #{grade,jdbcType=SMALLINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
			"#{updatedAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(Class record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
	 * @mbg.generated  Mon Jul 24 14:49:23 CST 2017
	 */
	int insertSelective(Class record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
	 * @mbg.generated  Mon Jul 24 14:49:23 CST 2017
	 */
	List<Class> selectByExample(ClassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
	 * @mbg.generated  Mon Jul 24 14:49:23 CST 2017
	 */
	@Select({ "select", "id, major_id, university_id, name, grade, created_at, updated_at", "from wzsport_class",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.ClassMapper.BaseResultMap")
	Class selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
	 * @mbg.generated  Mon Jul 24 14:49:23 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Class record, @Param("example") ClassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
	 * @mbg.generated  Mon Jul 24 14:49:23 CST 2017
	 */
	int updateByExample(@Param("record") Class record, @Param("example") ClassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
	 * @mbg.generated  Mon Jul 24 14:49:23 CST 2017
	 */
	int updateByPrimaryKeySelective(Class record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
	 * @mbg.generated  Mon Jul 24 14:49:23 CST 2017
	 */
	@Update({ "update wzsport_class", "set major_id = #{majorId,jdbcType=BIGINT},",
			"university_id = #{universityId,jdbcType=BIGINT},", "name = #{name,jdbcType=VARCHAR},",
			"grade = #{grade,jdbcType=SMALLINT},", "created_at = #{createdAt,jdbcType=TIMESTAMP},",
			"updated_at = #{updatedAt,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(Class record);

	/**
	* 根据教师id获取所有相关联的班级
	* 
	* @param teacherId 教师id
	*/
	@Select("SELECT class.id AS id, "
			+ "class.major_id AS marjor_id, "
			+ "class.university_id AS university_id, "
			+ "class.name AS name, "
			+ "class.grade AS grade, "
			+ "class.created_at AS created_at "
			+ "FROM wzsport_r_teacher_class "
			+ "JOIN wzsport_class as class ON wzsport_r_teacher_class.class_id = class.id "
			+ "WHERE wzsport_r_teacher_class.teacher_id = #{teacherId}")
	List<Class> listClassByTeacherId(long teacherId);
}