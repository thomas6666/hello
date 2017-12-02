package com.example.spring.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
  @Bean
  @Profile("dev")
  public DemoBean devDemoBean(){
	  return new DemoBean("这个是dev环境的bean!!");
  }
  @Bean
  @Profile("prod")
  public DemoBean prodDemoBean(){
	  return new DemoBean("这个是prod环境的bean!!");
  }
}
