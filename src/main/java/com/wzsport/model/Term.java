package com.wzsport.model;

import java.util.Date;

public class Term {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_term.id
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_term.university_id
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	private Long universityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_term.name
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_term.start_date
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	private Date startDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_term.end_date
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	private Date endDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_term.created_at
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_term.updated_at
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_term.id
	 * @return  the value of wzsport_term.id
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_term.id
	 * @param id  the value for wzsport_term.id
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_term.university_id
	 * @return  the value of wzsport_term.university_id
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	public Long getUniversityId() {
		return universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_term.university_id
	 * @param universityId  the value for wzsport_term.university_id
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_term.name
	 * @return  the value of wzsport_term.name
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_term.name
	 * @param name  the value for wzsport_term.name
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_term.start_date
	 * @return  the value of wzsport_term.start_date
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_term.start_date
	 * @param startDate  the value for wzsport_term.start_date
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_term.end_date
	 * @return  the value of wzsport_term.end_date
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_term.end_date
	 * @param endDate  the value for wzsport_term.end_date
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_term.created_at
	 * @return  the value of wzsport_term.created_at
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_term.created_at
	 * @param createdAt  the value for wzsport_term.created_at
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_term.updated_at
	 * @return  the value of wzsport_term.updated_at
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_term.updated_at
	 * @param updatedAt  the value for wzsport_term.updated_at
	 * @mbg.generated  Sat Jul 22 14:24:37 CST 2017
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}