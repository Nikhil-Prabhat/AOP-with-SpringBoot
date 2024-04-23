package com.example.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	// To make the pointcuts reusable
	// If we want to intercept across two layers , we can join the cuts with &&
	// Supppose there is a package refactoring , in that case, we would need to change in multiple files, which is not expected.
	// We can reuse pointcuts to minimise the changes

	@Pointcut("execution(* com.example.business.*.*(..))")
	public void businessLayerExecution() {

	}

	/*
	
	// Any bean containing Dao
	@Pointcut("bean(*Dao*)")
	public void beanContainingDao() {
	}
	
	@Pointcut("within(com.example.business..*)")
	public void businessLayerWithin()
	{
		
	}
	*/

}
