package com.wzsport.model;

import java.util.Date;

public class RunningActivity {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.id
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.project_id
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Long projectId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.student_id
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Long studentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.distance
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Integer distance;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.step_count
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Integer stepCount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.cost_time
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Integer costTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.speed
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Double speed;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.step_per_second
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Double stepPerSecond;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.distance_per_step
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Double distancePerStep;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.target_finished_time
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Integer targetFinishedTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.start_time
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Date startTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.calories_consumed
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Integer caloriesConsumed;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.qualified
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Boolean qualified;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.ended
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Boolean ended;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.qualified_distance
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Integer qualifiedDistance;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.qualified_cost_time
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Integer qualifiedCostTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.min_cost_time
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Integer minCostTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.created_at
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity.updated_at
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.id
	 * @return  the value of wzsport_running_activity.id
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.id
	 * @param id  the value for wzsport_running_activity.id
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.project_id
	 * @return  the value of wzsport_running_activity.project_id
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Long getProjectId() {
		return projectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.project_id
	 * @param projectId  the value for wzsport_running_activity.project_id
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.student_id
	 * @return  the value of wzsport_running_activity.student_id
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Long getStudentId() {
		return studentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.student_id
	 * @param studentId  the value for wzsport_running_activity.student_id
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.distance
	 * @return  the value of wzsport_running_activity.distance
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Integer getDistance() {
		return distance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.distance
	 * @param distance  the value for wzsport_running_activity.distance
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.step_count
	 * @return  the value of wzsport_running_activity.step_count
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Integer getStepCount() {
		return stepCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.step_count
	 * @param stepCount  the value for wzsport_running_activity.step_count
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setStepCount(Integer stepCount) {
		this.stepCount = stepCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.cost_time
	 * @return  the value of wzsport_running_activity.cost_time
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Integer getCostTime() {
		return costTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.cost_time
	 * @param costTime  the value for wzsport_running_activity.cost_time
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setCostTime(Integer costTime) {
		this.costTime = costTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.speed
	 * @return  the value of wzsport_running_activity.speed
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Double getSpeed() {
		return speed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.speed
	 * @param speed  the value for wzsport_running_activity.speed
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.step_per_second
	 * @return  the value of wzsport_running_activity.step_per_second
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Double getStepPerSecond() {
		return stepPerSecond;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.step_per_second
	 * @param stepPerSecond  the value for wzsport_running_activity.step_per_second
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setStepPerSecond(Double stepPerSecond) {
		this.stepPerSecond = stepPerSecond;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.distance_per_step
	 * @return  the value of wzsport_running_activity.distance_per_step
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Double getDistancePerStep() {
		return distancePerStep;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.distance_per_step
	 * @param distancePerStep  the value for wzsport_running_activity.distance_per_step
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setDistancePerStep(Double distancePerStep) {
		this.distancePerStep = distancePerStep;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.target_finished_time
	 * @return  the value of wzsport_running_activity.target_finished_time
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Integer getTargetFinishedTime() {
		return targetFinishedTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.target_finished_time
	 * @param targetFinishedTime  the value for wzsport_running_activity.target_finished_time
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setTargetFinishedTime(Integer targetFinishedTime) {
		this.targetFinishedTime = targetFinishedTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.start_time
	 * @return  the value of wzsport_running_activity.start_time
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.start_time
	 * @param startTime  the value for wzsport_running_activity.start_time
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.calories_consumed
	 * @return  the value of wzsport_running_activity.calories_consumed
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Integer getCaloriesConsumed() {
		return caloriesConsumed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.calories_consumed
	 * @param caloriesConsumed  the value for wzsport_running_activity.calories_consumed
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setCaloriesConsumed(Integer caloriesConsumed) {
		this.caloriesConsumed = caloriesConsumed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.qualified
	 * @return  the value of wzsport_running_activity.qualified
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Boolean getQualified() {
		return qualified;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.qualified
	 * @param qualified  the value for wzsport_running_activity.qualified
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setQualified(Boolean qualified) {
		this.qualified = qualified;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.ended
	 * @return  the value of wzsport_running_activity.ended
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Boolean getEnded() {
		return ended;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.ended
	 * @param ended  the value for wzsport_running_activity.ended
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setEnded(Boolean ended) {
		this.ended = ended;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.qualified_distance
	 * @return  the value of wzsport_running_activity.qualified_distance
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Integer getQualifiedDistance() {
		return qualifiedDistance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.qualified_distance
	 * @param qualifiedDistance  the value for wzsport_running_activity.qualified_distance
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setQualifiedDistance(Integer qualifiedDistance) {
		this.qualifiedDistance = qualifiedDistance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.qualified_cost_time
	 * @return  the value of wzsport_running_activity.qualified_cost_time
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Integer getQualifiedCostTime() {
		return qualifiedCostTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.qualified_cost_time
	 * @param qualifiedCostTime  the value for wzsport_running_activity.qualified_cost_time
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setQualifiedCostTime(Integer qualifiedCostTime) {
		this.qualifiedCostTime = qualifiedCostTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.min_cost_time
	 * @return  the value of wzsport_running_activity.min_cost_time
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Integer getMinCostTime() {
		return minCostTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.min_cost_time
	 * @param minCostTime  the value for wzsport_running_activity.min_cost_time
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setMinCostTime(Integer minCostTime) {
		this.minCostTime = minCostTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.created_at
	 * @return  the value of wzsport_running_activity.created_at
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.created_at
	 * @param createdAt  the value for wzsport_running_activity.created_at
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity.updated_at
	 * @return  the value of wzsport_running_activity.updated_at
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity.updated_at
	 * @param updatedAt  the value for wzsport_running_activity.updated_at
	 * @mbg.generated  Tue Jul 04 17:50:29 CST 2017
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}