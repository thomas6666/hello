package com.example.spring.aop;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 日志的切面
 * @author Administrator
 *
 */
@Aspect
@Component
public class LogAspect {
   
	/**
	 * 定义一个切点
	 */
	@Pointcut("@annotation(com.example.spring.aop.Action)")
	public void annotationPointCut()
	{
		
	}
	@Before("annotationPointCut()")
	public void before(JoinPoint joinpPoint)
	{
		MethodSignature methodSignature=(MethodSignature)joinpPoint.getSignature();
	    Method method=methodSignature.getMethod();
	    
	    Action action=method.getAnnotation(Action.class);
	    System.out.println("注解式拦截:"+action.name());
	}
	//注意这里的* 要有一个空格
	@After("execution(* com.example.spring.aop.MethodService.*(..))")
	public void after(JoinPoint joinpPoint)
	{
		MethodSignature methodSignature=(MethodSignature)joinpPoint.getSignature();
	    Method method=methodSignature.getMethod();
	    Parameter[] parameters=method.getParameters();
	    Object[] values=joinpPoint.getArgs();
	    if(parameters!=null&&parameters.length>0){
	    	System.out.println("参数名:"+parameters[0].getName()+",值:"+values[0].toString());
	    }
	    System.out.println("方法拦截:"+method.getName());
	}
}
