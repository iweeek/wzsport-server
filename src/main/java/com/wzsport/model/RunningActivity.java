package com.wzsport.model;

import java.util.Date;

/**
* RunningActivity 模型类
* 
* @author x1ny
* @date 2017年5月26日
*/
public class RunningActivity {

	private Integer id;
	private Integer projectId;
	private Integer studentId;
	private Student student;
	private Integer distance;
	private Integer costTime;
	private Integer targetTime;
	private Date startTime;
	private Integer costCalorie;
	private Boolean qualified;
	private Date createdAt;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
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
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	public Integer getCostTime() {
		return costTime;
	}
	public void setCostTime(Integer costTime) {
		this.costTime = costTime;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Integer getCostCalorie() {
		return costCalorie;
	}
	public void setCostCalorie(Integer costCalorie) {
		this.costCalorie = costCalorie;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Boolean getQualified() {
		return qualified;
	}
	public void setQualified(Boolean qualified) {
		this.qualified = qualified;
	}
	public Integer getTargetTime() {
		return targetTime;
	}
	public void setTargetTime(Integer targetTime) {
		this.targetTime = targetTime;
	}
}
