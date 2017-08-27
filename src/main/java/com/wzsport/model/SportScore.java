package com.wzsport.model;

import java.util.Date;

public class SportScore {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_score.id
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_score.student_id
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	private Long studentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_score.term_id
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	private Long termId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_score.meter50_sprint_time
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	private Double meter50SprintTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_score.meter50_sprint_score
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	private Integer meter50SprintScore;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_score.standing_jump_distance
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	private Integer standingJumpDistance;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_score.standing_jump_score
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	private Integer standingJumpScore;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_score.meter1500_run_time
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	private Integer meter1500RunTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_score.meter1500_run_score
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	private Integer meter1500RunScore;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_score.abdominal_curl_count
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	private Integer abdominalCurlCount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_score.abdominal_curl_score
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	private Integer abdominalCurlScore;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_score.created_at
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_score.updated_at
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_score.id
	 * @return  the value of wzsport_sport_score.id
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_score.id
	 * @param id  the value for wzsport_sport_score.id
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_score.student_id
	 * @return  the value of wzsport_sport_score.student_id
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public Long getStudentId() {
		return studentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_score.student_id
	 * @param studentId  the value for wzsport_sport_score.student_id
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_score.term_id
	 * @return  the value of wzsport_sport_score.term_id
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public Long getTermId() {
		return termId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_score.term_id
	 * @param termId  the value for wzsport_sport_score.term_id
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public void setTermId(Long termId) {
		this.termId = termId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_score.meter50_sprint_time
	 * @return  the value of wzsport_sport_score.meter50_sprint_time
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public Double getMeter50SprintTime() {
		return meter50SprintTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_score.meter50_sprint_time
	 * @param meter50SprintTime  the value for wzsport_sport_score.meter50_sprint_time
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public void setMeter50SprintTime(Double meter50SprintTime) {
		this.meter50SprintTime = meter50SprintTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_score.meter50_sprint_score
	 * @return  the value of wzsport_sport_score.meter50_sprint_score
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public Integer getMeter50SprintScore() {
		return meter50SprintScore;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_score.meter50_sprint_score
	 * @param meter50SprintScore  the value for wzsport_sport_score.meter50_sprint_score
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public void setMeter50SprintScore(Integer meter50SprintScore) {
		this.meter50SprintScore = meter50SprintScore;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_score.standing_jump_distance
	 * @return  the value of wzsport_sport_score.standing_jump_distance
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public Integer getStandingJumpDistance() {
		return standingJumpDistance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_score.standing_jump_distance
	 * @param standingJumpDistance  the value for wzsport_sport_score.standing_jump_distance
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public void setStandingJumpDistance(Integer standingJumpDistance) {
		this.standingJumpDistance = standingJumpDistance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_score.standing_jump_score
	 * @return  the value of wzsport_sport_score.standing_jump_score
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public Integer getStandingJumpScore() {
		return standingJumpScore;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_score.standing_jump_score
	 * @param standingJumpScore  the value for wzsport_sport_score.standing_jump_score
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public void setStandingJumpScore(Integer standingJumpScore) {
		this.standingJumpScore = standingJumpScore;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_score.meter1500_run_time
	 * @return  the value of wzsport_sport_score.meter1500_run_time
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public Integer getMeter1500RunTime() {
		return meter1500RunTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_score.meter1500_run_time
	 * @param meter1500RunTime  the value for wzsport_sport_score.meter1500_run_time
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public void setMeter1500RunTime(Integer meter1500RunTime) {
		this.meter1500RunTime = meter1500RunTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_score.meter1500_run_score
	 * @return  the value of wzsport_sport_score.meter1500_run_score
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public Integer getMeter1500RunScore() {
		return meter1500RunScore;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_score.meter1500_run_score
	 * @param meter1500RunScore  the value for wzsport_sport_score.meter1500_run_score
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public void setMeter1500RunScore(Integer meter1500RunScore) {
		this.meter1500RunScore = meter1500RunScore;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_score.abdominal_curl_count
	 * @return  the value of wzsport_sport_score.abdominal_curl_count
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public Integer getAbdominalCurlCount() {
		return abdominalCurlCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_score.abdominal_curl_count
	 * @param abdominalCurlCount  the value for wzsport_sport_score.abdominal_curl_count
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public void setAbdominalCurlCount(Integer abdominalCurlCount) {
		this.abdominalCurlCount = abdominalCurlCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_score.abdominal_curl_score
	 * @return  the value of wzsport_sport_score.abdominal_curl_score
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public Integer getAbdominalCurlScore() {
		return abdominalCurlScore;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_score.abdominal_curl_score
	 * @param abdominalCurlScore  the value for wzsport_sport_score.abdominal_curl_score
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public void setAbdominalCurlScore(Integer abdominalCurlScore) {
		this.abdominalCurlScore = abdominalCurlScore;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_score.created_at
	 * @return  the value of wzsport_sport_score.created_at
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_score.created_at
	 * @param createdAt  the value for wzsport_sport_score.created_at
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_score.updated_at
	 * @return  the value of wzsport_sport_score.updated_at
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_score.updated_at
	 * @param updatedAt  the value for wzsport_sport_score.updated_at
	 * @mbg.generated  Sun Aug 27 14:55:14 CST 2017
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}