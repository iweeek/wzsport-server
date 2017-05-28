package com.wzsport.model;

import java.util.Date;
/**
 * 体育成绩类
 * @author linhongyong
 * 2017年5月27日
 */
public class SportGrade {
	private Integer id;
	private Integer studentId;
	private Float meter50;
	private Integer meter50Grade;
	private Float standingJump;			    //立定跳远
	private Integer standingJumpGrade;		//立定跳远得分
	private Integer meter1500;
	private Integer meter1500Grade;
	private Integer abdominalCurl;			//仰卧起坐
	private Integer abdominalCurlGrade;		//仰卧起坐得分
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
	public Float getMeter50() {
		return meter50;
	}
	public void setMeter50(Float meter50) {
		this.meter50 = meter50;
	}
	public Integer getMeter50Grade() {
		return meter50Grade;
	}
	public void setMeter50Grade(Integer meter50Grade) {
		this.meter50Grade = meter50Grade;
	}
	public Float getStandingJump() {
		return standingJump;
	}
	public void setStandingJump(Float standingJump) {
		this.standingJump = standingJump;
	}
	public Integer getStandingJumpGrade() {
		return standingJumpGrade;
	}
	public void setStandingJumpGrade(Integer standingJumpGrade) {
		this.standingJumpGrade = standingJumpGrade;
	}
	public Integer getMeter1500() {
		return meter1500;
	}
	public void setMeter1500(Integer meter1500) {
		this.meter1500 = meter1500;
	}
	public Integer getMeter1500Grade() {
		return meter1500Grade;
	}
	public void setMeter1500Grade(Integer meter1500Grade) {
		this.meter1500Grade = meter1500Grade;
	}
	public Integer getAbdominalCurl() {
		return abdominalCurl;
	}
	public void setAbdominalCurl(Integer abdominalCurl) {
		this.abdominalCurl = abdominalCurl;
	}
	public Integer getAbdominalCurlGrade() {
		return abdominalCurlGrade;
	}
	public void setAbdominalCurlGrade(Integer abdominalCurlGrade) {
		this.abdominalCurlGrade = abdominalCurlGrade;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
}
