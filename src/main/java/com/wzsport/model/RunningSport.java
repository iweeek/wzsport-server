package com.wzsport.model;

import java.util.Date;

public class RunningSport {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_sport.id
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_sport.university_id
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	private Long universityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_sport.name
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_sport.type
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	private String type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_sport.enabled
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	private Boolean enabled;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_sport.sample_num
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	private Byte sampleNum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_sport.qualified_distance
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	private Integer qualifiedDistance;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_sport.qualified_cost_time
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	private Integer qualifiedCostTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_sport.min_cost_time
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	private Integer minCostTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_sport.hourly_kcal_consumption
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	private Integer hourlyKcalConsumption;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_sport.acquisition_interval
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	private Integer acquisitionInterval;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_sport.created_at
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_sport.updated_at
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_sport.id
	 * @return  the value of wzsport_running_sport.id
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_sport.id
	 * @param id  the value for wzsport_running_sport.id
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_sport.university_id
	 * @return  the value of wzsport_running_sport.university_id
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public Long getUniversityId() {
		return universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_sport.university_id
	 * @param universityId  the value for wzsport_running_sport.university_id
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_sport.name
	 * @return  the value of wzsport_running_sport.name
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_sport.name
	 * @param name  the value for wzsport_running_sport.name
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_sport.type
	 * @return  the value of wzsport_running_sport.type
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_sport.type
	 * @param type  the value for wzsport_running_sport.type
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_sport.enabled
	 * @return  the value of wzsport_running_sport.enabled
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_sport.enabled
	 * @param enabled  the value for wzsport_running_sport.enabled
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_sport.sample_num
	 * @return  the value of wzsport_running_sport.sample_num
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public Byte getSampleNum() {
		return sampleNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_sport.sample_num
	 * @param sampleNum  the value for wzsport_running_sport.sample_num
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public void setSampleNum(Byte sampleNum) {
		this.sampleNum = sampleNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_sport.qualified_distance
	 * @return  the value of wzsport_running_sport.qualified_distance
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public Integer getQualifiedDistance() {
		return qualifiedDistance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_sport.qualified_distance
	 * @param qualifiedDistance  the value for wzsport_running_sport.qualified_distance
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public void setQualifiedDistance(Integer qualifiedDistance) {
		this.qualifiedDistance = qualifiedDistance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_sport.qualified_cost_time
	 * @return  the value of wzsport_running_sport.qualified_cost_time
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public Integer getQualifiedCostTime() {
		return qualifiedCostTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_sport.qualified_cost_time
	 * @param qualifiedCostTime  the value for wzsport_running_sport.qualified_cost_time
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public void setQualifiedCostTime(Integer qualifiedCostTime) {
		this.qualifiedCostTime = qualifiedCostTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_sport.min_cost_time
	 * @return  the value of wzsport_running_sport.min_cost_time
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public Integer getMinCostTime() {
		return minCostTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_sport.min_cost_time
	 * @param minCostTime  the value for wzsport_running_sport.min_cost_time
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public void setMinCostTime(Integer minCostTime) {
		this.minCostTime = minCostTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_sport.hourly_kcal_consumption
	 * @return  the value of wzsport_running_sport.hourly_kcal_consumption
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public Integer getHourlyKcalConsumption() {
		return hourlyKcalConsumption;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_sport.hourly_kcal_consumption
	 * @param hourlyKcalConsumption  the value for wzsport_running_sport.hourly_kcal_consumption
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public void setHourlyKcalConsumption(Integer hourlyKcalConsumption) {
		this.hourlyKcalConsumption = hourlyKcalConsumption;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_sport.acquisition_interval
	 * @return  the value of wzsport_running_sport.acquisition_interval
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public Integer getAcquisitionInterval() {
		return acquisitionInterval;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_sport.acquisition_interval
	 * @param acquisitionInterval  the value for wzsport_running_sport.acquisition_interval
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public void setAcquisitionInterval(Integer acquisitionInterval) {
		this.acquisitionInterval = acquisitionInterval;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_sport.created_at
	 * @return  the value of wzsport_running_sport.created_at
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_sport.created_at
	 * @param createdAt  the value for wzsport_running_sport.created_at
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_sport.updated_at
	 * @return  the value of wzsport_running_sport.updated_at
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_sport.updated_at
	 * @param updatedAt  the value for wzsport_running_sport.updated_at
	 * @mbg.generated  Thu Jul 27 14:56:18 CST 2017
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}