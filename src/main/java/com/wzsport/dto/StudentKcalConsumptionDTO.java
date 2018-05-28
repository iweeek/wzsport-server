package com.wzsport.dto;

public class StudentKcalConsumptionDTO {

	private Long studentId;
	private String studentName;
	private Long kcalConsumption;
	private String avatarUrl;
	private String collegeName;
	private Long universityId;
	
	public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
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
	public Long getKcalConsumption() {
		return kcalConsumption;
	}
	public void setKcalConsumption(Long kcalConsumption) {
		this.kcalConsumption = kcalConsumption;
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
