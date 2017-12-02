package com.example.spring.data.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.spring.data.IStudentDao;
import com.example.spring.domain.Student;

/**
 * 学生的数据访问层.
 * @author Administrator
 *
 */
@Repository
public class StudentDao implements IStudentDao {

	@Override
	public List<Student> getStudents() {
		List<Student> students=new ArrayList<Student>();
		Student stu1=new Student();
		stu1.setStudentId("stu001");
		stu1.setStudentName("张晓娟");
		
		Student stu2=new Student();
		stu2.setStudentId("stu002");
		stu2.setStudentName("刘强");
		
		students.add(stu1);
		students.add(stu2);
		return students;
	}
  
}
