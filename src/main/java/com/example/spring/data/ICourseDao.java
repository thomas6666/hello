package com.example.spring.data;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.spring.domain.Course;

@Repository
public interface ICourseDao  {
	/**
	 * 根据学生ID 获取课程.
	 * @param studentId 学生ID.
	 * @return 学生的课程.
	 */
  public List<Course> getCourseByStudentId(String studentId);
}
