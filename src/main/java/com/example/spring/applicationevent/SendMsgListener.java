package com.example.spring.applicationevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
/**
 * 发送消息的监听器
 * @author Administrator
 *
 */
@Component
public class SendMsgListener implements ApplicationListener<SendMsgEvent> {

	@Override
	public void onApplicationEvent(SendMsgEvent event) {
		String msg=event.getMsg();
		System.out.println("我 (bean-SendMsgListener) 接收到了bean-sendMsgPublisher发布的消息:"+msg);
	}
}
