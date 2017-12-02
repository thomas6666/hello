package com.example.hello;
import org.junit.Test;
import static junit.framework.Assert.*;
public class HelloTest
{
	@Test
	public void testSayHi()
	{
       Hello hello=new Hello();
       String result=hello.sayHi("mayun");
       assertEquals("Hello,mayun!",result);	   
	}
	
}