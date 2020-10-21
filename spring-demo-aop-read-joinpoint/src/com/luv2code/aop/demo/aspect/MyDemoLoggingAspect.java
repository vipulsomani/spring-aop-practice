package com.luv2code.aop.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aop.demo.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
		//advices here
	//@Before("execution(public void  add*())")
	
	@Before("com.luv2code.aop.demo.aspect.NewAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("\n==------>>>>>Excecuting Account advice");
		
		//display method signature and arguments
		MethodSignature methodsig = (MethodSignature) theJoinPoint.getSignature();
		System.out.println("Method: "+ methodsig);
		
		//display method arguments
		
		//get args
		Object[] args = theJoinPoint.getArgs();
		
		//loop arguments
		for(Object tempArg : args)
		{
			System.out.println(tempArg);
			if(tempArg instanceof Account) {
				//downcast and print account specific stuff
				Account theAccount =(Account) tempArg;
				System.out.println("account name : "+ theAccount.getName());
				System.out.println("account level: "+ theAccount.getLevel());
			}
		}
	}
}
