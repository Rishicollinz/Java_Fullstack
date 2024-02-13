package com;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
	@Pointcut("within(com..*))")
	public void authenticatingPointcut() {
		
	}
	
	@Pointcut("within(com..*))")
	public void authorizationPointcut() {
		
	}
	
	@Before("authenticatingPointcut() && authorizationPointcut()")
	public void both(JoinPoint joinpoint){
		System.out.println("Authenticating the both request before "+joinpoint);
		
	}
	
//	@Before("authenticatingPointcut()")
//	public void authenticate(JoinPoint joinpoint) {
//		System.out.println("Authenticating the request before "+joinpoint);
//	}
//	
//	@After("authenticatingPointcut()")
//	public void authenticate1(JoinPoint joinpoint){
//		System.out.println("Authenticating the request after "+joinpoint);
//	}
//	
//	@After("authenticatingPointcut()")
//	public void authorization(JoinPoint joinpoint){
//		System.out.println("Authorization the request after "+joinpoint.getSignature());
//	}
	
	
	
	
}