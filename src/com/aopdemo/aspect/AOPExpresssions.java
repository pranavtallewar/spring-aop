package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPExpresssions {

	@Before("execution(public void com.aopdemo.dao.*.addAccount())")
	// @Before("execution(public void com.aopdemo.dao.AccountDao.addAccount())")
	public void beforeAddAccount() {
		System.out.println("===========Advice being executed before==========");
	}

	@Pointcut("execution(* add*())")
	public void matchingAllAddMethod() {
		System.out.println("===========Advice matching any add method in any class====");
	}

	@Pointcut("execution(* com.aopdemo.dao.*.*(..))")
	public void matchingAllMethods() {
	}

	// @Before("execution(String com.aopdemo.dao.*.*())")
	@Pointcut("execution(String *())")
	public void matchinReturnTypeOfAnyMethod() {
	}

	@Pointcut("execution(* get*(..))")
	public void getter() {

	}

	@Pointcut("execution(* set*())")
	public void setter() {
	}

	@Pointcut("matchingAllMethods() && !(getter() || setter())")
	public void forAllMethodsNoGetterSetter() {
	}

}
