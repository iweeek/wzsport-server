package com.wzsport.model;

import java.util.Date;
import java.util.List;
/**
* 用户模型类
* 
* @author x1ny
* @date 2017年5月9日
*/
public class User {
	
	private Integer id;
	private String username;
	private String password;
	private String latestToken;
	private List<Role> roles;
	private Date createdAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLatestToken() {
		return latestToken;
	}

	public void setLatestToken(String latestToken) {
		this.latestToken = latestToken;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
