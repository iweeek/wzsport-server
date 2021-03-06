package com.wzsport.mapper;

import com.wzsport.model.ActivityDataCollection;
import com.wzsport.model.ActivityDataCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ActivityDataCollectionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_activity_data_collection
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	long countByExample(ActivityDataCollectionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_activity_data_collection
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	int deleteByExample(ActivityDataCollectionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_activity_data_collection
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	@Delete({ "delete from wzsport_activity_data_collection", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_activity_data_collection
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	@Insert({ "insert into wzsport_activity_data_collection (activity_id, collection_data)",
			"values (#{activityId,jdbcType=BIGINT}, #{collectionData,jdbcType=LONGVARCHAR})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(ActivityDataCollection record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_activity_data_collection
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	int insertSelective(ActivityDataCollection record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_activity_data_collection
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	List<ActivityDataCollection> selectByExampleWithBLOBs(ActivityDataCollectionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_activity_data_collection
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	List<ActivityDataCollection> selectByExample(ActivityDataCollectionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_activity_data_collection
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	@Select({ "select", "id, activity_id, collection_data", "from wzsport_activity_data_collection",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.ActivityDataCollectionMapper.ResultMapWithBLOBs")
	ActivityDataCollection selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_activity_data_collection
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	int updateByExampleSelective(@Param("record") ActivityDataCollection record,
			@Param("example") ActivityDataCollectionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_activity_data_collection
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	int updateByExampleWithBLOBs(@Param("record") ActivityDataCollection record,
			@Param("example") ActivityDataCollectionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_activity_data_collection
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	int updateByExample(@Param("record") ActivityDataCollection record,
			@Param("example") ActivityDataCollectionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_activity_data_collection
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	int updateByPrimaryKeySelective(ActivityDataCollection record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_activity_data_collection
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	@Update({ "update wzsport_activity_data_collection", "set activity_id = #{activityId,jdbcType=BIGINT},",
			"collection_data = #{collectionData,jdbcType=LONGVARCHAR}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKeyWithBLOBs(ActivityDataCollection record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_activity_data_collection
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	@Update({ "update wzsport_activity_data_collection", "set activity_id = #{activityId,jdbcType=BIGINT}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(ActivityDataCollection record);
}