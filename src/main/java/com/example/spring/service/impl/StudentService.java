package com.example.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * 学生类业务逻辑.
 * @author Administrator
 *
 */
import org.springframework.stereotype.Service;

import com.example.spring.data.ICourseDao;
import com.example.spring.data.IStudentDao;
import com.example.spring.domain.Student;
import com.example.spring.service.IStudentService;
@Service
public class StudentService implements IStudentService  {

	@Autowired
	private IStudentDao studentDao;
	
	@Autowired
	private ICourseDao courseDao;
	
	@Override
	public List<Student> getStudents() {
		List<Student>  students=studentDao.getStudents();
		for (Student student : students) {
			student.setCourses(courseDao.getCourseByStudentId(student.getStudentId()));
		}
		return students;
	}
   
	public StudentService(){
		super();
		System.out.println("StudentService 构造函数..");
	}
	
	public void init(){
		System.out.println("StudentService init  @bean initMethod方法..");
	}
	
	public void destroy(){
		System.out.println("StudentService destroy @bean destroyMethod方法..");
	}
}
