package com.wzsport.model;

import java.util.Date;

/**
* RunningProject 模型类
* 
* @author x1ny
* @date 2017年5月26日
*/
public class RunningProject {

	private Integer id;
	private Integer universityId;
	private University university;
	private String name;
	private String type;
	private Boolean enabled;
	private Integer qualifiedDistance;
	private Integer qualifiedCostTime;
	private Integer minCostTime;
	private Integer hourlyCalorieConsumption;
	private Date createdAt;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getQualifiedDistance() {
		return qualifiedDistance;
	}
	public void setQualifiedDistance(Integer qualifiedDistance) {
		this.qualifiedDistance = qualifiedDistance;
	}
	public Integer getQualifiedCostTime() {
		return qualifiedCostTime;
	}
	public void setQualifiedCostTime(Integer qualifiedCostTime) {
		this.qualifiedCostTime = qualifiedCostTime;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public Integer getMinCostTime() {
		return minCostTime;
	}
	public void setMinCostTime(Integer minCostTime) {
		this.minCostTime = minCostTime;
	}
	public Integer getHourlyCalorieConsumption() {
		return hourlyCalorieConsumption;
	}
	public void setHourlyCalorieConsumption(Integer hourlyCalorieConsumption) {
		this.hourlyCalorieConsumption = hourlyCalorieConsumption;
	}
}
