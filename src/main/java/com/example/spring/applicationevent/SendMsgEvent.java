package com.example.spring.applicationevent;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 * 
 * @author Administrator
 *
 */
public class SendMsgEvent extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SendMsgEvent(Object source,String msg) {
		super(source);
		this.msg=msg;
	}

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
