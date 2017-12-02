package com.example.spring.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringScope {
	public static void main(String[] args) {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringScopeConfig.class);
       SingletonService s1=context.getBean(SingletonService.class);
       SingletonService s2=context.getBean(SingletonService.class);
       
       PrototypeService p1=context.getBean(PrototypeService.class);
       PrototypeService p2=context.getBean(PrototypeService.class);
       
       System.out.println("s1和s2 实例是否相等:"+s1.equals(s2));
       System.out.println("p1和p2 实例是否相等:"+p1.equals(p2));
		
	}
}
