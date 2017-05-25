package com.wzsport.model;

import java.util.Date;

/**
* 角色模型类.
*
* @author x1ny
* @date 2017年5月9日
*/
public class Role {
	
	private Integer id;
	private String name;
	private Date createdAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
