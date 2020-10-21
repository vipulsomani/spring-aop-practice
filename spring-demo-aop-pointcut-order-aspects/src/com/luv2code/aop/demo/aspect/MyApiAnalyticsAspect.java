package com.luv2code.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspect {

	@Before("com.luv2code.aop.demo.aspect.NewAopExpressions.forDaoPackageNoGetterSetter()")
	public void performAnalytics() {
		System.out.println("\n---------->>>> Performin Analytics");
	}
}
