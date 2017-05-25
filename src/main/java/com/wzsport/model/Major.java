package com.wzsport.model;

import java.util.Date;

/**
* 专业模型类
* 
* @author x1ny
* @date 2017年5月25日
*/
public class Major {

	private Integer id;
	private String name;
	private Integer collegeId;
	private College college;
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
	public Integer getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
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
