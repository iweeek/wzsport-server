package com.wzsport.model;

import java.util.Date;

public class Class {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_class.id
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_class.major_id
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	private Long majorId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_class.university_id
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	private Long universityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_class.name
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_class.grade
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	private Integer grade;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_class.id
	 * @return  the value of wzsport_class.id
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_class.id
	 * @param id  the value for wzsport_class.id
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_class.major_id
	 * @return  the value of wzsport_class.major_id
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public Long getMajorId() {
		return majorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_class.major_id
	 * @param majorId  the value for wzsport_class.major_id
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void setMajorId(Long majorId) {
		this.majorId = majorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_class.university_id
	 * @return  the value of wzsport_class.university_id
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public Long getUniversityId() {
		return universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_class.university_id
	 * @param universityId  the value for wzsport_class.university_id
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_class.name
	 * @return  the value of wzsport_class.name
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_class.name
	 * @param name  the value for wzsport_class.name
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_class.grade
	 * @return  the value of wzsport_class.grade
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public Integer getGrade() {
		return grade;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_class.grade
	 * @param grade  the value for wzsport_class.grade
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
}