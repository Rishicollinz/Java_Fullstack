package com;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
@Component
public class LoggingAspect {
	@Before("execution( void com.ShoppingCart.disp(..))")
	public void beforeLoggers() {
		System.out.println("Before Loggers");
	}
	
	@After("execution(* *.*.checkout(..))")
	public void afterLoggers() {
		System.out.println("After Loggers");
	}
}