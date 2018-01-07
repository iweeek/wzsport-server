package com.wzsport.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.Role;
import com.wzsport.model.RoleExample;

public interface RoleMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    long countByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    int deleteByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    @Delete({ "delete from wzsport_role", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    @Insert({ "insert into wzsport_role (name, priv_ids, ", "created_at, updated_at)",
            "values (#{name,jdbcType=VARCHAR}, #{privIds,jdbcType=VARCHAR}, ",
            "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    List<Role> selectByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    @Select({ "select", "id, name, priv_ids, created_at, updated_at", "from wzsport_role",
            "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.wzsport.mapper.RoleMapper.BaseResultMap")
    Role selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_role
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    @Update({ "update wzsport_role", "set name = #{name,jdbcType=VARCHAR},", "priv_ids = #{privIds,jdbcType=VARCHAR},",
            "created_at = #{createdAt,jdbcType=TIMESTAMP},", "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(Role record);
}