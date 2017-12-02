package com.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.hello.UseHello;
import com.example.spring.aop.AnnotationService;
import com.example.spring.aop.MethodService;
import com.example.spring.domain.Course;
import com.example.spring.domain.Student;
import com.example.spring.service.IStudentService;

/**
 * 系统入口
 * 
 * @author Administrator
 *
 */
public class SystemEntry {

	public static void main(String[] args) {
		//使用 AnnotationConfigApplicationContext作为spring的容器
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
	    
		/*IStudentService studentService=context.getBean(IStudentService.class);
		
		for (Student stu : studentService.getStudents()) {
			System.out.println(stu.getStudentId()+";"+stu.getStudentName());
			System.out.println("必修的课程有:");
			for (Course course :stu.getCourses()) {
				System.out.println(course.getCourseId()+";"+course.getCourseName());
			}
			System.out.println("==============");
		}
		
		//这个bean 在BeanConfig设置配置。
		UseHello useHello=context.getBean(UseHello.class);
		useHello.showName("spring");
		System.out.println("===========");*/
		
		//AOP实现例子
		//AnnotationService annotationService=context.getBean(AnnotationService.class);
		//annotationService.add();
		
		MethodService methodService=context.getBean(MethodService.class);
		methodService.add();
		methodService.result("aop");
		context.close();
	}

}
