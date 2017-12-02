package com.example.spring.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AnnotationConfigApplicationContext conext=new AnnotationConfigApplicationContext(ELConfig.class);
    ELConfig elConfig=conext.getBean(ELConfig.class);
    elConfig.outputResource();
    conext.close();
	}

}
