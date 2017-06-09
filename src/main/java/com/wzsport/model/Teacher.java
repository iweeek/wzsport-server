package com.wzsport.model;

import java.util.Date;

public class Teacher {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_teacher.id
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_teacher.job_no
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	private String jobNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_teacher.university_id
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	private Long universityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_teacher.name
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_teacher.is_man
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	private Boolean man;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_teacher.created_at
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_teacher.updated_at
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_teacher.id
	 * @return  the value of wzsport_teacher.id
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_teacher.id
	 * @param id  the value for wzsport_teacher.id
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_teacher.job_no
	 * @return  the value of wzsport_teacher.job_no
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	public String getJobNo() {
		return jobNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_teacher.job_no
	 * @param jobNo  the value for wzsport_teacher.job_no
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_teacher.university_id
	 * @return  the value of wzsport_teacher.university_id
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	public Long getUniversityId() {
		return universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_teacher.university_id
	 * @param universityId  the value for wzsport_teacher.university_id
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_teacher.name
	 * @return  the value of wzsport_teacher.name
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_teacher.name
	 * @param name  the value for wzsport_teacher.name
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_teacher.is_man
	 * @return  the value of wzsport_teacher.is_man
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	public Boolean getMan() {
		return man;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_teacher.is_man
	 * @param man  the value for wzsport_teacher.is_man
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	public void setMan(Boolean man) {
		this.man = man;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_teacher.created_at
	 * @return  the value of wzsport_teacher.created_at
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_teacher.created_at
	 * @param createdAt  the value for wzsport_teacher.created_at
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_teacher.updated_at
	 * @return  the value of wzsport_teacher.updated_at
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_teacher.updated_at
	 * @param updatedAt  the value for wzsport_teacher.updated_at
	 * @mbg.generated  Thu Jun 08 16:04:56 CST 2017
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}