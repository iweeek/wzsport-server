package com.wzsport.model;

import java.util.Date;

/**
 * 体侧成绩类
 * @author Watermelon_R(ljf)
 * 2017年5月26日
 */
public class FitnessCheckData {
	
	private Integer id;
	private Integer studentId;
	private Student student;
	private Integer height;
	private Integer weight;
	private Integer lungCapacity;           //肺活量
	private Float   bmi;                     //需公式换算:质指数（BMI）=体重（kg）÷身高^2（m）
	private Date createAt;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getLungCapacity() {
		return lungCapacity;
	}
	public void setLungCapacity(Integer lungCapacity) {
		this.lungCapacity = lungCapacity;
	}
	public Float getBmi() {
		return bmi;
	}
	public void setBmi(Float bmi) {
		this.bmi = bmi;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
}
