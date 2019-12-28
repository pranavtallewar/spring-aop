package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoggingAspect {

	// @Before("execution(* add*(com.aopdemo.dao.AccountDao, ..))")
	@Before("forMatchingInpParams()")
	public void matchingInputParams() {
		System.out.println("======Advice matching for input arguments===========");
	}

	@Pointcut("execution(* add*())")
	public void forMatchingInpParams() {

	}

}
