package com.wzsport.model;

import java.util.Date;

public class College {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_college.id
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_college.university_id
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	private Long universityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_college.name
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	private String name;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_college.id
	 * @return  the value of wzsport_college.id
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_college.id
	 * @param id  the value for wzsport_college.id
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_college.university_id
	 * @return  the value of wzsport_college.university_id
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public Long getUniversityId() {
		return universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_college.university_id
	 * @param universityId  the value for wzsport_college.university_id
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_college.name
	 * @return  the value of wzsport_college.name
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_college.name
	 * @param name  the value for wzsport_college.name
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void setName(String name) {
		this.name = name;
	}
}