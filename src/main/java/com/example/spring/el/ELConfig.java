package com.example.spring.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.example.spring.el")
@PropertySource( value="classpath:com/example/spring/el/el.properties",encoding="UTF-8")
public class ELConfig {
	//注入普通的文本
	@Value("这个是一个简单的文本注入资源")
   private String normal;
	
	//注入 el 表达式 获取系统的名称
	@Value("#{systemProperties['os.name']}")
	private String osName;
	
	//注入表达式结果
	@Value("#{T(java.lang.Math).random()*100.0}")
	private double randomNumber;
	
	//注入其他bean的属性
	@Value("#{simpleValue.author}")
	private String fromAuthor;
	
	//注入文件资源
	@Value("classpath:com/example/spring/el/testFile.txt")
	private Resource testFile;
	
	//注入网络资源
	@Value("http://www.baidu.com")
	private Resource baiduUrl;
	
	//读取properties资源
	@Value("${book.name}")
	private String bookName;
	
	//注入
	@Autowired
	private Environment environment;
	
	//注入读取properties文件的配置
	@Bean
	private static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	public void outputResource(){
		try{
		System.out.println(normal);
		System.out.println(osName);
		System.out.println(randomNumber);
		System.out.println(fromAuthor);
		System.out.println(IOUtils.toString(testFile.getInputStream()));
		System.out.println(IOUtils.toString(baiduUrl.getInputStream()));
		System.out.println(bookName);
		System.out.println(environment.getProperty("book.name"));
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
