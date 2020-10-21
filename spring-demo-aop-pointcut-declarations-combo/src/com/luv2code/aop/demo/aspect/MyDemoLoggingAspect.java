package com.luv2code.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
		//advices here
	//@Before("execution(public void  add*())")
	@Pointcut("execution(* com.luv2code.aop.demo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	//create new pointcut gor getter and seter method and one for includ eexclude
	@Pointcut("execution(* com.luv2code.aop.demo.dao.*.get*(..))")
	private void getter() {}
	
	@Pointcut("execution(* com.luv2code.aop.demo.dao.*.set*(..))")
	private void setter() {}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter() {}
	
	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n==------>>>>>Excecuting @Before Advice on addAccount");
	}
	@Before("forDaoPackageNoGetterSetter()")
	public void performAnalytics() {
		System.out.println("\n---------->>>> Performin Analytics");
	}
	
}
