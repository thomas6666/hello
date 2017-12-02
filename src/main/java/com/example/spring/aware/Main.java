package com.example.spring.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
      AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AwareConfig.class);
      AwareService service=context.getBean(AwareService.class);
      service.outputResource();
      context.close();
	}
}
