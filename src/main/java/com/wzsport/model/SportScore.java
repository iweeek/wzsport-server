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
	private Float meter50Sprint;
	private Integer meter50SprintScore;
	private Integer standingJump;			    //立定跳远
	private Integer standingJumpScore;		//立定跳远得分
	private Integer meter1500Run;
	private Integer meter1500RunScore;
	private Integer abdominalCurl;			//仰卧起坐
	private Integer abdominalCurlScore;		//仰卧起坐得分
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
	public Float getMeter50Sprint() {
		return meter50Sprint;
	}
	public void setMeter50Sprint(Float meter50Sprint) {
		this.meter50Sprint = meter50Sprint;
	}
	public Integer getMeter50SprintScore() {
		return meter50SprintScore;
	}
	public void setMeter50SprintScore(Integer meter50SprintScore) {
		this.meter50SprintScore = meter50SprintScore;
	}
	public Integer getStandingJump() {
		return standingJump;
	}
	public void setStandingJump(Integer standingJump) {
		this.standingJump = standingJump;
	}
	public Integer getStandingJumpScore() {
		return standingJumpScore;
	}
	public void setStandingJumpScore(Integer standingJumpScore) {
		this.standingJumpScore = standingJumpScore;
	}
	public Integer getMeter1500Run() {
		return meter1500Run;
	}
	public void setMeter1500Run(Integer meter1500Run) {
		this.meter1500Run = meter1500Run;
	}
	public Integer getMeter1500RunScore() {
		return meter1500RunScore;
	}
	public void setMeter1500RunScore(Integer meter1500RunScore) {
		this.meter1500RunScore = meter1500RunScore;
	}
	public Integer getAbdominalCurl() {
		return abdominalCurl;
	}
	public void setAbdominalCurl(Integer abdominalCurl) {
		this.abdominalCurl = abdominalCurl;
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
