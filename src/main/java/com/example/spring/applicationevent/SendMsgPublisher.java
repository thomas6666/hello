package com.example.spring.applicationevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SendMsgPublisher {
  @Autowired
  ApplicationContext applicationContext;
  /**
   * 发布事件
   * @param msg
   */
  public void publish(String msg){
	  applicationContext.publishEvent(new SendMsgEvent(this, msg));
  }
}
