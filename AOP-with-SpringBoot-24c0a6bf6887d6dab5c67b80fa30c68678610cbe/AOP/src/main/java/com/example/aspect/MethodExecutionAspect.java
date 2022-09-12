package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Configuration
@Aspect
public class MethodExecutionAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/*
	 * We can do anything before intercepting the method and after intercepting the
	 * method, hence it is very useful One scenario is method execution time
	 */

	@Around("execution(* com.example.business.*.*(..))")
	public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		// let it proceed
		proceedingJoinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time taken by {} is {}", proceedingJoinPoint, timeTaken);

	}

}
