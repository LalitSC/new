package com.example.Employee;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* com.example.Employee.Services.*.*(..))")
	public void logBefore(JoinPoint point) {
		System.out.println("Before method call : "+point.getSignature().getName());
	}
	
	@After("execution(* com.example.Employee.Services.*.*(..))")
	public void logAfter(JoinPoint point) {
		System.out.println("After method call : "+point.getSignature().getName());
	}
}
