package com.wzsport.model;

import java.util.Date;

/**
* 瀛︾敓妯″瀷绫�.
*
* @author x1ny
* @date 2017骞�5鏈�22鏃�
*/
public class Student {

	private Integer id;
	private String studentNo;
	private String name;
	private boolean man;
	private Integer userId;
	private User user;
	private Integer classId;
	private Class studentClass;
	private Integer universityId;
	private University university;
	private Date createdAt;
	
	public Integer getId() { 
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public Class getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(Class studentClass) {
		this.studentClass = studentClass;
	}
	public Integer getUniversityId() {
		return universityId;
	}
	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentNo=" + studentNo + ", name=" + name + ", man=" + man + ", userId="
				+ userId + ", user=" + user + ", classId=" + classId + ", studentClass=" + studentClass
				+ ", universityId=" + universityId + ", university=" + university + ", createdAt=" + createdAt + "]";
	}
}
