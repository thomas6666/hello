package com.example.spring.initordestory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.service.IStudentService;

public class Main {
	public static void main(String[] args) {
      AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
      IStudentService studentService=context.getBean(IStudentService.class);
      context.close();
	}
}
