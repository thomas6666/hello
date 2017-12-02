package com.example.spring.domain;

import org.springframework.stereotype.Component;
/**
 * 课程类.
 * @author Administrator
 *
 */
@Component
public class Course {
	private String courseId;
	private String courseName;

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
