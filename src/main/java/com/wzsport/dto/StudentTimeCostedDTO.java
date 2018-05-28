package com.wzsport.dto;

public class StudentTimeCostedDTO {

	private Long studentId;
	private String studentName;
	private Long timeCosted;
	private String avatarUrl;
	private Long universityId;

	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getTimeCosted() {
		return timeCosted;
	}
	public void setTimeCosted(Long timeCosted) {
		this.timeCosted = timeCosted;
	}
	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	public Long getUniversityId() {
		return universityId;
	}
	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}
}
