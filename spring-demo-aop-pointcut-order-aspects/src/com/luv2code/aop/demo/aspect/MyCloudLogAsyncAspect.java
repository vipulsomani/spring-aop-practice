package com.luv2code.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAsyncAspect {

	@Before("com.luv2code.aop.demo.aspect.NewAopExpressions.forDaoPackageNoGetterSetter()")
	public void logToCloud() {
		System.out.println("\n---------->>>> Logging to cloud");
	}
}
