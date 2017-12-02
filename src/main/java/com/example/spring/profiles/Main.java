package com.example.spring.profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
     
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		//先将活动的Profile设置为prod
		context.getEnvironment().setActiveProfiles("dev");
		//后置注册Bean配置类，不然Bean会报未定义的错误
		context.register(ProfileConfig.class);
		//刷新容器
		context.refresh();
		DemoBean demoBean=context.getBean(DemoBean.class);
		System.out.println(demoBean.getContent());
		context.close();
	}

}
