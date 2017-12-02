package com.example.spring.domain;

import java.util.List;

import org.springframework.stereotype.Component;
/**
 * 学生类.
 * @author Administrator
 *
 */
@Component
public class Student {
	private String studentId;
	private String studentName;
    private List<Course> courses;
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
   
	
}
