package com.wzsport.model;

import java.util.Date;

public class SignIn {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sign_in.id
	 * @mbg.generated  Mon Aug 28 23:39:37 CST 2017
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sign_in.activity_id
	 * @mbg.generated  Mon Aug 28 23:39:37 CST 2017
	 */
	private Long activityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sign_in.student_id
	 * @mbg.generated  Mon Aug 28 23:39:37 CST 2017
	 */
	private Long studentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sign_in.sign_in_time
	 * @mbg.generated  Mon Aug 28 23:39:37 CST 2017
	 */
	private Date signInTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sign_in.id
	 * @return  the value of wzsport_sign_in.id
	 * @mbg.generated  Mon Aug 28 23:39:37 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sign_in.id
	 * @param id  the value for wzsport_sign_in.id
	 * @mbg.generated  Mon Aug 28 23:39:37 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sign_in.activity_id
	 * @return  the value of wzsport_sign_in.activity_id
	 * @mbg.generated  Mon Aug 28 23:39:37 CST 2017
	 */
	public Long getActivityId() {
		return activityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sign_in.activity_id
	 * @param activityId  the value for wzsport_sign_in.activity_id
	 * @mbg.generated  Mon Aug 28 23:39:37 CST 2017
	 */
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sign_in.student_id
	 * @return  the value of wzsport_sign_in.student_id
	 * @mbg.generated  Mon Aug 28 23:39:37 CST 2017
	 */
	public Long getStudentId() {
		return studentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sign_in.student_id
	 * @param studentId  the value for wzsport_sign_in.student_id
	 * @mbg.generated  Mon Aug 28 23:39:37 CST 2017
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sign_in.sign_in_time
	 * @return  the value of wzsport_sign_in.sign_in_time
	 * @mbg.generated  Mon Aug 28 23:39:37 CST 2017
	 */
	public Date getSignInTime() {
		return signInTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sign_in.sign_in_time
	 * @param signInTime  the value for wzsport_sign_in.sign_in_time
	 * @mbg.generated  Mon Aug 28 23:39:37 CST 2017
	 */
	public void setSignInTime(Date signInTime) {
		this.signInTime = signInTime;
	}
}