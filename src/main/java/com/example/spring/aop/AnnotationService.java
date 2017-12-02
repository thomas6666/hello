package com.example.spring.aop;

import org.springframework.stereotype.Service;

/**
 * 使用注解的被拦截的类.
 * @author Administrator
 *
 */
@Service
public class AnnotationService {
   @Action(name="注解式拦截的add操作")
	public void add(){
	   System.out.println("我是一个add方法");
   }
}
