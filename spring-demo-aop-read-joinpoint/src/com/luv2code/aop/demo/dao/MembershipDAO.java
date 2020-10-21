package com.luv2code.aop.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public void addVip() {
		System.out.println(getClass() + "Adding a membership Account");
	}
	public void goToSleep() {
		System.out.println("Go to sleep");
	}

}
