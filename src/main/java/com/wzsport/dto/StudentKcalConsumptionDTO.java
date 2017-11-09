package com.wzsport.dto;

public class StudentKcalConsumptionDTO {

	private Long studentId;
	private String studentName;
	private Integer kcalConsumption;
	private String avatarUrl;
	private String collegeName;
	private Long rankNo;
	
	public Long getRankNo() {
        return rankNo;
    }
    public void setRankNo(Long rankNo) {
        this.rankNo = rankNo;
    }
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
	public Integer getKcalConsumption() {
		return kcalConsumption;
	}
	public void setKcalConsumption(Integer kcalConsumption) {
		this.kcalConsumption = kcalConsumption;
	}
	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
}
