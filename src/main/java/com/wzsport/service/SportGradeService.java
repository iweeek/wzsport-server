package com.wzsport.service;

import com.wzsport.model.SportGrade;


/**
 * 体育成绩类
 * @author linhongyong
 * 2017年5月27日
 */
public interface SportGradeService {
	
	
	/**
	 * 创建保存体育成绩
	 * @param sportGrade 体育成绩对象
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
