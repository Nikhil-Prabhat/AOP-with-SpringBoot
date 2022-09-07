package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
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
public class AfterAOPAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// What kind of method calls I would intercept
	// execution(* PACKAGE.*.*(..)) -- PointCut
	// @PointCut is used to create the pointcut
	// @AfterThrowing is used to throw exceptions but can't be used with @After
	
	@Pointcut("execution(* com.example.repository.*.*(..))")
	public void createPointCut()
	{
		
	}

	@AfterReturning(value = "execution(* com.example.repository.*.*(..))", returning = "result")
	// This returning result will be mapped to parameter result
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("{} returned with value {}", joinPoint, result);
	}
	
	@After("execution(* com.example.business.*.*(..))")
	public void after(JoinPoint joinPoint) {
		logger.info("after execution of {}", joinPoint);
	}

}
