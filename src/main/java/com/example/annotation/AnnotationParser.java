package com.example.annotation;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

import java.lang.annotation.Annotation;

import org.junit.Test;

public class AnnotationParser {
    /**
     * 解析
     */
	public static void parse() {
      Class<Person> pClass=Person.class;
      /*if(pClass.isAnnotationPresent(Name.class)){
    	 //System.out.println("这个是Name注解");
    	 Name name=pClass.getAnnotation(Name.class);
    	 System.out.println(name.value());
      }*/
      //批量获取注解
      Annotation[] ans=pClass.getAnnotations();
      for (Annotation annotation : ans) {
		if(annotation instanceof Name){
			System.out.println("这个是Name 注解!");
			System.out.println(((Name)annotation).value());
		}
		if(annotation instanceof Description){
			System.out.println("这个是Description 注解!");
			System.out.println(((Description)annotation).value());
		}
	  }
	}
	
	@Test
	public void testParse(){
		AnnotationParser.parse();
	}
}
