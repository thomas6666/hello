package com.example.spring.aop;

import org.springframework.stereotype.Service;
/**
 * 使用方法规则被拦截类
 * @author Administrator
 *
 */
@Service
public class MethodService {
  public void add(){
	  System.out.println("我是一个add方法");
  }
  
  public void result(String name){
	  System.out.println("返回结果:"+name);
  }
}
