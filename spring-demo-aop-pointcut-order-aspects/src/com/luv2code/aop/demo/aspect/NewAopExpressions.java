package com.luv2code.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NewAopExpressions {
		
	@Pointcut("execution(* com.luv2code.aop.demo.dao.*.*(..))")
	public void forDaoPackage() {}
	
	//create new pointcut gor getter and seter method and one for includ eexclude
	@Pointcut("execution(* com.luv2code.aop.demo.dao.*.get*(..))")
	public void getter() {}
	
	@Pointcut("execution(* com.luv2code.aop.demo.dao.*.set*(..))")
	public void setter() {}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {}
	

}
