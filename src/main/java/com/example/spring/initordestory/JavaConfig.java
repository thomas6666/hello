package com.example.spring.initordestory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.spring.service.IStudentService;
import com.example.spring.service.impl.StudentService;

@Configuration
@ComponentScan("com.example.spring")
public class JavaConfig {
   @Bean(initMethod="init",destroyMethod="destroy")	
   public IStudentService studentService(){
	   return new StudentService();
   }
}
