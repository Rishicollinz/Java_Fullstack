package com;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@Before("execution(void com.ShoppingCart.checkout(..))")
	public void beforeLogger() {
		System.out.println("Before Loggers...");
	}
	@After("execution(* *.*.*(..))")
	public void afterLogger() {
		System.out.println("After Loggers...");
	}
}
