package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.hello.Hello;
import com.example.hello.UseHello;

/**
 * 使用java 方式配置
 * @author Administrator
 *
 */
@Configuration
@ComponentScan("com.example.spring")
@EnableAspectJAutoProxy //开启spring对AspectJ的代理支持
public class BeanConfig {
  
	@Bean
	public Hello hello(){
		return new Hello();
	}
	
	@Bean
	public UseHello useHello(Hello hello){
		UseHello useHello=new UseHello(hello);
		return useHello;
	}
}
