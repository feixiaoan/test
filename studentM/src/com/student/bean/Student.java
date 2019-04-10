package com.student.bean;

public class Student {

	private Integer studentId;
	private String studentName;
	private String studentPassword;
	private Integer studentSex;
	private String studentNumber;
	
	public Student() {}
	
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	
	public String getStudentPassword() {
		return studentPassword;
	}
	
	public void setStudentSex(Integer studentSex) {
		this.studentSex = studentSex;
	}
	
	public Integer getStudentSex() {
		return studentSex;
	}
	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
}
