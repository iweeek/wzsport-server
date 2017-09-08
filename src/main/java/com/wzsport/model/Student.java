package com.wzsport.model;

import java.util.Date;

public class Student {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_student.id
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_student.user_id
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	private Long userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_student.class_id
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	private Long classId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_student.university_id
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	private Long universityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_student.student_no
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	private String studentNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_student.is_man
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	private Boolean man;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_student.name
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_student.created_at
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_student.updated_at
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_student.id
	 * @return  the value of wzsport_student.id
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_student.id
	 * @param id  the value for wzsport_student.id
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_student.user_id
	 * @return  the value of wzsport_student.user_id
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_student.user_id
	 * @param userId  the value for wzsport_student.user_id
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_student.class_id
	 * @return  the value of wzsport_student.class_id
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public Long getClassId() {
		return classId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_student.class_id
	 * @param classId  the value for wzsport_student.class_id
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public void setClassId(Long classId) {
		this.classId = classId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_student.university_id
	 * @return  the value of wzsport_student.university_id
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public Long getUniversityId() {
		return universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_student.university_id
	 * @param universityId  the value for wzsport_student.university_id
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_student.student_no
	 * @return  the value of wzsport_student.student_no
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public String getStudentNo() {
		return studentNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_student.student_no
	 * @param studentNo  the value for wzsport_student.student_no
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_student.is_man
	 * @return  the value of wzsport_student.is_man
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public Boolean getMan() {
		return man;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_student.is_man
	 * @param man  the value for wzsport_student.is_man
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public void setMan(Boolean man) {
		this.man = man;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_student.name
	 * @return  the value of wzsport_student.name
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_student.name
	 * @param name  the value for wzsport_student.name
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_student.created_at
	 * @return  the value of wzsport_student.created_at
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_student.created_at
	 * @param createdAt  the value for wzsport_student.created_at
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_student.updated_at
	 * @return  the value of wzsport_student.updated_at
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_student.updated_at
	 * @param updatedAt  the value for wzsport_student.updated_at
	 * @mbg.generated  Fri Sep 08 17:25:05 CST 2017
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}