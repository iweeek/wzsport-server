package com.wzsport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.wzsport.dto.StudentKcalConsumptionDTO;
import com.wzsport.dto.StudentTimeCostedDTO;
import com.wzsport.model.University;
import com.wzsport.model.UniversityExample;

public interface UniversityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	long countByExample(UniversityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	int deleteByExample(UniversityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	@Delete({ "delete from wzsport_university", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	@Insert({ "insert into wzsport_university (name, created_at, ", "updated_at)",
			"values (#{name,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ", "#{updatedAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(University record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	int insertSelective(University record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	List<University> selectByExample(UniversityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	@Select({ "select", "id, name, created_at, updated_at", "from wzsport_university",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.UniversityMapper.BaseResultMap")
	University selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	int updateByExampleSelective(@Param("record") University record, @Param("example") UniversityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	int updateByExample(@Param("record") University record, @Param("example") UniversityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	int updateByPrimaryKeySelective(University record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_university
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	@Update({ "update wzsport_university", "set name = #{name,jdbcType=VARCHAR},",
			"created_at = #{createdAt,jdbcType=TIMESTAMP},", "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(University record);

	/**
	* 获取指定大学的学生卡路里消耗量的排名列表
	* 
	* @param universityId 大学id
	*/
	@Select("SELECT student.id AS student_id, student.name AS student_name, SUM(activity.kcal_consumed) AS kcal_consumption "
			+ "FROM wzsport_student AS student "
			+ "JOIN wzsport_running_activity AS activity ON student.id = activity.student_id "
			+ "WHERE student.university_id = #{universityId} "
			+ "GROUP BY student.id "
			+ "ORDER BY kcal_consumption DESC")
	List<StudentKcalConsumptionDTO> getCalorieCostedRanking(@Param("universityId") long universityId);
	
	/**
	* 获取指定大学的学生运动时长的排名列表
	* 
	* @param universityId 大学id
	*/
	@Select("SELECT student.id AS student_id, student.name AS student_name, SUM(activity.cost_time) AS time_costed "
			+ "FROM wzsport_student AS student "
			+ "JOIN wzsport_running_activity AS activity ON student.id = activity.student_id "
			+ "WHERE student.university_id = #{universityId} "
			+ "GROUP BY student.id "
			+ "ORDER BY time_costed DESC")
	List<StudentTimeCostedDTO> getTimeCostedRanking(@Param("universityId") long universityId);
}