package com.wzsport.mapper;

import com.wzsport.model.Device;
import com.wzsport.model.DeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.SelectKey;

public interface DeviceMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_device
	 * @mbg.generated  Fri Aug 18 17:56:06 CST 2017
	 */
	long countByExample(DeviceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_device
	 * @mbg.generated  Fri Aug 18 17:56:06 CST 2017
	 */
	int deleteByExample(DeviceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_device
	 * @mbg.generated  Fri Aug 18 17:56:06 CST 2017
	 */
	@Delete({ "delete from wzsport_device", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_device
	 * @mbg.generated  Fri Aug 18 17:56:06 CST 2017
	 */
	@Insert({ "insert into wzsport_device (device_id, user_id)",
			"values (#{deviceId,jdbcType=VARCHAR}, #{userId,jdbcType=BIGINT})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(Device record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_device
	 * @mbg.generated  Fri Aug 18 17:56:06 CST 2017
	 */
	int insertSelective(Device record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_device
	 * @mbg.generated  Fri Aug 18 17:56:06 CST 2017
	 */
	List<Device> selectByExample(DeviceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_device
	 * @mbg.generated  Fri Aug 18 17:56:06 CST 2017
	 */
	@Select({ "select", "id, device_id, user_id", "from wzsport_device", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.DeviceMapper.BaseResultMap")
	Device selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_device
	 * @mbg.generated  Fri Aug 18 17:56:06 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Device record, @Param("example") DeviceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_device
	 * @mbg.generated  Fri Aug 18 17:56:06 CST 2017
	 */
	int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_device
	 * @mbg.generated  Fri Aug 18 17:56:06 CST 2017
	 */
	int updateByPrimaryKeySelective(Device record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_device
	 * @mbg.generated  Fri Aug 18 17:56:06 CST 2017
	 */
	@Update({ "update wzsport_device", "set device_id = #{deviceId,jdbcType=VARCHAR},",
			"user_id = #{userId,jdbcType=BIGINT}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(Device record);
}