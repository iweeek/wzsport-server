package com.wzsport.model;

import java.util.Date;
/**
 * 体育成绩类
 * @author linhongyong
 * 2017年5月27日
 */
public class SportScore {
	private Integer id;
	private Integer studentId;
	private Float meter50SprintTime;
	private Integer meter50SprintScore;
	private Integer standingJumpDistance;			    //立定跳远距离
	private Integer standingJumpScore;					//立定跳远得分
	private Integer meter1500RunTime;
	private Integer meter1500RunScore;
	private Integer abdominalCurlCount;					//仰卧起坐个数
	private Integer abdominalCurlScore;					//仰卧起坐得分
	private Date createdAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public Float getMeter50SprintTime() {
		return meter50SprintTime;
	}
	public void setMeter50SprintTime(Float meter50SprintTime) {
		this.meter50SprintTime = meter50SprintTime;
	}
	public Integer getMeter50SprintScore() {
		return meter50SprintScore;
	}
	public void setMeter50SprintScore(Integer meter50SprintScore) {
		this.meter50SprintScore = meter50SprintScore;
	}
	public Integer getStandingJumpDistance() {
		return standingJumpDistance;
	}
	public void setStandingJumpDistance(Integer standingJumpDistance) {
		this.standingJumpDistance = standingJumpDistance;
	}
	public Integer getStandingJumpScore() {
		return standingJumpScore;
	}
	public void setStandingJumpScore(Integer standingJumpScore) {
		this.standingJumpScore = standingJumpScore;
	}
	public Integer getMeter1500RunTime() {
		return meter1500RunTime;
	}
	public void setMeter1500RunTime(Integer meter1500RunTime) {
		this.meter1500RunTime = meter1500RunTime;
	}
	public Integer getMeter1500RunScore() {
		return meter1500RunScore;
	}
	public void setMeter1500RunScore(Integer meter1500RunScore) {
		this.meter1500RunScore = meter1500RunScore;
	}
	public Integer getAbdominalCurlCount() {
		return abdominalCurlCount;
	}
	public void setAbdominalCurlCount(Integer abdominalCurlCount) {
		this.abdominalCurlCount = abdominalCurlCount;
	}
	public Integer getAbdominalCurlScore() {
		return abdominalCurlScore;
	}
	public void setAbdominalCurlScore(Integer abdominalCurlScore) {
		this.abdominalCurlScore = abdominalCurlScore;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
	
}
