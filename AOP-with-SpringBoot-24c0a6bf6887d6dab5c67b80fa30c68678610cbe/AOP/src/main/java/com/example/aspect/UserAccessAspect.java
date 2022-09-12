package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Configuration
@Aspect
public class UserAccessAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/* 
	 * 1. We don't need to apply this before every method manually, it can be done via aspect 
	 * 2. PointCut - The expression that is written inside @Before is known as pointcut
	 * 3. Advice   - Advice is basically what should I do in the pointcut implemented methods
	 * 4. Aspect   - Combination of pointcut and advice
	 * 5. JoinPoint- Specific Execution Instance i.e if 100 times the methods are executed, then joinpoint is the each instance for a method
	 * 6. Weaving - The process of implementing AOP around a method is called weaving
	 * 7. Weaver  - The framework that does it is called weaver
	 */
	
	// What kind of method calls I would intercept
	// execution(* PACKAGE.*.*(..)) -- PointCut
	
	@Before("com.example.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void before(JoinPoint joinPoint) {
		//Advice
		logger.info("Check for user access");
		logger.info("Allowed execution for {} ", joinPoint);
	}

}
