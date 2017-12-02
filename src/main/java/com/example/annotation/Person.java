package com.example.annotation;

@Name("这是一个人")
@Description("这是一个类")

public class Person {
    @Description("这是一个方法,说话")
	public void say() {
      System.out.println("say");
	}
    
    @Description("这也是一个方法,微笑")
    public void smile(){
    	
    }
    
}
