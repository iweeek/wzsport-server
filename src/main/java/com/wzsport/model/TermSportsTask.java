package com.wzsport.model;

/**
* TermSportsTask - 学期任务
* 
* @author x1ny
* @date 2017年6月6日
*/
public class TermSportsTask {

	private Integer id;
	private Integer termId;
	private Integer targetSportsTimes;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTermId() {
		return termId;
	}
	public void setTermId(Integer termId) {
		this.termId = termId;
	}
	public Integer getTargetSportsTimes() {
		return targetSportsTimes;
	}
	public void setTargetSportsTimes(Integer targetSportsTimes) {
		this.targetSportsTimes = targetSportsTimes;
	}
}
