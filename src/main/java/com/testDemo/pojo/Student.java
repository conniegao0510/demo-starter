package com.testDemo.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Student {
	
	private int student_number;
	@JsonIgnore
	private String password;
	private String lastfirst;
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss a", locale="en", timezone="GMT+8")
	private Date dob;
	private int campusid;
	private int grade;
	@JsonInclude(Include.NON_NULL)
	private String desc;
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStudent_number() {
		return student_number;
	}
	public void setStudent_number(int student_number) {
		this.student_number = student_number;
	}
	public String getLastfirst() {
		return lastfirst;
	}
	public void setLastfirst(String lastfirst) {
		this.lastfirst = lastfirst;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getCampusid() {
		return campusid;
	}
	public void setCampusid(int campusid) {
		this.campusid = campusid;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	

}
