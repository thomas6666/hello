package com.example.spring.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncTaskService {
	
	/**
	 * 
	 * 通过@Async注解表明该方法为异步，如果注解在类的级别，则表明该类所有的方法
	 * 都是异步的方法，而这里的方法自动被注入使用ThreadPoolTaskExecutor
	 * 作为TaskExecutor
	 */
	
	@Async
	public void executeAsyncTask(Integer i){
		System.out.println("执行异步的任务:"+i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i){
		System.out.println("执行异步的任务(i+1):"+(i+1));
	}
}
