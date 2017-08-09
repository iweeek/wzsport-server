package com.wzsport.model;

import java.util.Date;
import java.util.List;

public class User {
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_user.id
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_user.username
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_user.password
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_user.university_id
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	private Long universityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_user.latest_token
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	private String latestToken;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_user.created_at
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_user.updated_at
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_user.id
	 * @return  the value of wzsport_user.id
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_user.id
	 * @param id  the value for wzsport_user.id
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_user.username
	 * @return  the value of wzsport_user.username
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_user.username
	 * @param username  the value for wzsport_user.username
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_user.password
	 * @return  the value of wzsport_user.password
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_user.password
	 * @param password  the value for wzsport_user.password
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_user.university_id
	 * @return  the value of wzsport_user.university_id
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	public Long getUniversityId() {
		return universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_user.university_id
	 * @param universityId  the value for wzsport_user.university_id
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_user.latest_token
	 * @return  the value of wzsport_user.latest_token
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	public String getLatestToken() {
		return latestToken;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_user.latest_token
	 * @param latestToken  the value for wzsport_user.latest_token
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	public void setLatestToken(String latestToken) {
		this.latestToken = latestToken;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_user.created_at
	 * @return  the value of wzsport_user.created_at
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_user.created_at
	 * @param createdAt  the value for wzsport_user.created_at
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_user.updated_at
	 * @return  the value of wzsport_user.updated_at
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_user.updated_at
	 * @param updatedAt  the value for wzsport_user.updated_at
	 * @mbg.generated  Wed Aug 09 13:15:05 CST 2017
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * 用户的角色集合
	 */
	private List<Role> roles;
	
    public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}