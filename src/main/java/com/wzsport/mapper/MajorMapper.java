package com.wzsport.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.Major;
import com.wzsport.model.MajorExample;

public interface MajorMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_major
     * @mbg.generated  Wed Jan 03 16:53:25 CST 2018
     */
    long countByExample(MajorExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_major
     * @mbg.generated  Wed Jan 03 16:53:25 CST 2018
     */
    int deleteByExample(MajorExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_major
     * @mbg.generated  Wed Jan 03 16:53:25 CST 2018
     */
    @Delete({ "delete from wzsport_major", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_major
     * @mbg.generated  Wed Jan 03 16:53:25 CST 2018
     */
    @Insert({ "insert into wzsport_major (college_id, university_id, ", "name, created_at, ", "updated_at)",
            "values (#{collegeId,jdbcType=BIGINT}, #{universityId,jdbcType=BIGINT}, ",
            "#{name,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ", "#{updatedAt,jdbcType=TIMESTAMP})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(Major record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_major
     * @mbg.generated  Wed Jan 03 16:53:25 CST 2018
     */
    int insertSelective(Major record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_major
     * @mbg.generated  Wed Jan 03 16:53:25 CST 2018
     */
    List<Major> selectByExample(MajorExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_major
     * @mbg.generated  Wed Jan 03 16:53:25 CST 2018
     */
    @Select({ "select", "id, college_id, university_id, name, created_at, updated_at", "from wzsport_major",
            "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.wzsport.mapper.MajorMapper.BaseResultMap")
    Major selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_major
     * @mbg.generated  Wed Jan 03 16:53:25 CST 2018
     */
    int updateByExampleSelective(@Param("record") Major record, @Param("example") MajorExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_major
     * @mbg.generated  Wed Jan 03 16:53:25 CST 2018
     */
    int updateByExample(@Param("record") Major record, @Param("example") MajorExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_major
     * @mbg.generated  Wed Jan 03 16:53:25 CST 2018
     */
    int updateByPrimaryKeySelective(Major record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_major
     * @mbg.generated  Wed Jan 03 16:53:25 CST 2018
     */
    @Update({ "update wzsport_major", "set college_id = #{collegeId,jdbcType=BIGINT},",
            "university_id = #{universityId,jdbcType=BIGINT},", "name = #{name,jdbcType=VARCHAR},",
            "created_at = #{createdAt,jdbcType=TIMESTAMP},", "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(Major record);
}