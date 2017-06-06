package com.wzsport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.Term;

/**
* Term Mapper.
* 
* @author x1ny
* @date 2017年6月6日
*/
public interface TermMapper {
	
	/**
	* 根据id获取Term
	* 
	* @param id
	*/
	@Select("SELECT * FROM term WHERE id = #{id}")
	Term getTermById(int id);
	
	/**
	* 根据universityId获取所有相关联的Term
	* 
	* @param id
	*/
	@Select("SELECT * FROM term WHERE university_id = #{universityId}")
	List<Term> listTermByUniversiyId(int universityId);
	
	/**
	* 新增Term
	* 
	* @param term
	*/
	@Insert("INSERT INTO term (university_id, name, start_date, end_date)"
			+ "VALUES (#{universityId}, #{name}, #{startDate}, #{endDate} )")
	@Options(useGeneratedKeys=true)
	int save(Term term);
	
	
	/**
	* 更新Term
	* 
	* @param term
	*/
	@Update("UPDATE term SET name = #{name}, start_date = #{startDate},"
			+ "end_date = #{endDate} WHERE id = #{id}")
	int update(Term term);
	
	/**
	* 根据id删除term
	* 
	* @param id
	*/
	@Delete("DELETE FROM term WHERE id=#{id}")  
    public int delete(int id); 
}
