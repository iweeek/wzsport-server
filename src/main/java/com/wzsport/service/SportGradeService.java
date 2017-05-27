package com.wzsport.service;

import com.wzsport.model.SportGrade;


/**
 * 体测成绩Service Interface
 * @author Watermelon_R(ljf)
 * 2017年5月26日
 */
public interface SportGradeService {
	
	
	/**
	 * 创建保存体测成绩
	 * @param sportGrade 体测成绩对象
	 * @return
	 */
	SportGrade create(SportGrade sportGrade);
	
	/**
	 * 根据id去更新一条记录
	 * @param id
	 * @param sportGrade
	 * @return
	 */
	SportGrade update(SportGrade sportGrade);
	
	
}
