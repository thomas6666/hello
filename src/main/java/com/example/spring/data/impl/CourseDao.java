package com.example.spring.data.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.spring.data.ICourseDao;
import com.example.spring.data.utils.GenerateDataUtil;
import com.example.spring.domain.Course;
/**
 * 课程持久化层
 * @author Administrator
 *
 */
@Repository
public class CourseDao implements ICourseDao {

	@Override
	public List<Course> getCourseByStudentId(String studentId) {
		if("stu001".equals(studentId)){
			return GenerateDataUtil.createCourse(4);
		}
		else if("stu002".equals(studentId)){
			return GenerateDataUtil.createCourse(5);
		}
		else{
			return new ArrayList<Course>();
		}
	}
  
}
