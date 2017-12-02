package com.example.spring.data;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.spring.domain.Student;

@Repository
public interface IStudentDao {
   /**
    * 获取所有的学生.
    * @return
    */
	public List<Student> getStudents();
}
