package com.wzsport.dto;

public class StudentCaloriesConsumptionDTO {

	private Long studentId;
	private String studentName;
	private Integer caloriesConsumption;
	
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
	public Integer getCaloriesConsumption() {
		return caloriesConsumption;
	}
	public void setCaloriesConsumption(Integer caloriesConsumption) {
		this.caloriesConsumption = caloriesConsumption;
	}
}
