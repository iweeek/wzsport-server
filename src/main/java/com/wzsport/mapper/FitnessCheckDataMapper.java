package com.wzsport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.FitnessCheckData;

public interface FitnessCheckDataMapper {
	
	/**
	 * 根据id获取体侧成绩
	 * @param id
	 * @return
	 */
	@Select("SELECT * FROM fitness_check_data WHERE id = #{id}")
	FitnessCheckData getFitnessCheckDataById(Integer id);
	
	//TODO:删除
	
	/**
	 * 根据关联的学生id获取其体侧成绩
	 * @param stuId 学生Id
	 * @return 学生体测成绩集合
	 */
	@Select("SELECT * FROM fitness_check_data WHERE student_id = #{studentId}")
	List<FitnessCheckData> listFitnessCheckDataByStudentId(Integer studentId);
	
	
	/**
	 * 保存一条体测记录
	 * @param fitnessCheckData 体测成绩对象
	 * @return
	 */
	@Insert("INSERT INTO "
			+ "fitness_check_data(student_id,height,weight,lung_capacity,BMI)"
			+ "VALUES(#{studentId},#{height},#{weight},#{lungCapacity},#{bmi})")
	@Options(useGeneratedKeys=true)
	int save(FitnessCheckData fitnessCheckData);
	
	/**
	 * 根据ID更新体测成绩
	 * @param fitnessCheckData
	 */
	@Update("UPDATE fitness_check_data SET height = #{height}, weight = #{weight},"
			+ "lung_capacity = #{lungCapacity}, BMI = #{bmi} WHERE id = #{id}")
	void updateFitnessCheckDataById(FitnessCheckData fitnessCheckData);
	
}
