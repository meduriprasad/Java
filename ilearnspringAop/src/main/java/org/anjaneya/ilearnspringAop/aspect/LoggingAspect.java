package org.anjaneya.ilearnspringAop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("execution(public String getName())")
	public void LoggingAdvice(){
		System.out.println("Advice run..get method called");
	}
	
	@Before("allGetters()")
	public void LoggingAdvice1(){
		System.out.println("Advice run..get method with zero or more arguments");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){
		System.out.println("Advice run..point cut...");
	}
}
