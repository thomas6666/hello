package com.example.spring.applicationevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
      AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ApplicationEventConfig.class);
      SendMsgPublisher publisher=context.getBean(SendMsgPublisher.class);
      publisher.publish("习近平主席发来的祝贺！！");
      context.close();
	}

}
