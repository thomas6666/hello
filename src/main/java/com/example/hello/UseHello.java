package com.example.hello;

public class UseHello {
	private Hello hello;

	public UseHello(Hello hello) {
		this.hello=hello;
	}
    
	public void showName(String name) {
      System.out.println(hello.sayHi(name));
	}
}
