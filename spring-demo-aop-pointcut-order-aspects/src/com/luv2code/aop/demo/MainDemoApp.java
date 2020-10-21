package com.luv2code.aop.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aop.demo.dao.AccountDAO;
import com.luv2code.aop.demo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		//read config class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
			
		//get bean
		
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		MembershipDAO theMembershipDAO =
				context.getBean("membershipDAO",MembershipDAO.class);
		//call business method
		Account myAccount = new Account();
		theAccountDAO.addAccount(myAccount,true);
		theMembershipDAO.addVip();
		
		theAccountDAO.setName("Vipul");
		theAccountDAO.setServiceCode("Gold");
		String name=theAccountDAO.getName();
		String code=theAccountDAO.getServiceCode();
		
		
		
		theAccountDAO.doWork();
		theMembershipDAO.goToSleep();
		//close contect
		context.close();
	}

}
