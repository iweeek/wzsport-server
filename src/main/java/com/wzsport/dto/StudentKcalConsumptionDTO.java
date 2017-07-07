package com.wzsport.dto;

public class StudentKcalConsumptionDTO {

	private Long studentId;
	private String studentName;
	private Integer kcalConsumption;
	
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getKcalConsumption() {
		return kcalConsumption;
	}
	public void setKcalConsumption(Integer kcalConsumption) {
		this.kcalConsumption = kcalConsumption;
	}
}
