package com.wzsport.model;

import java.util.Date;

/**
* 班级模型类.
* 
* @author x1ny
* @date 2017年5月25日
*/
public class Class {

	private Integer id;
	private String name;
	private Integer gradle;
	private Integer majorId;
	private Major major;
	private Integer universityId;
	private University university;
	private Date createdAt;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGradle() {
		return gradle;
	}
	public void setGradle(Integer gradle) {
		this.gradle = gradle;
	}
	public Integer getMajorId() {
		return majorId;
	}
	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public Integer getUniversityId() {
		return universityId;
	}
	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
