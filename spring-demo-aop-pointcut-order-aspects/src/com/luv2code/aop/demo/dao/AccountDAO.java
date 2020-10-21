package com.luv2code.aop.demo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aop.demo.Account;

@Component
public class AccountDAO {
	private String name;
	private String serviceCode;
	
	public void addAccount(Account theAccount,boolean vipFlag) {
		System.out.println(getClass() + "Doing my work adding an account");
	}
	public boolean doWork(){
		System.out.println("I am doing work");
		return false;
	}
	public String getName() {
		System.out.println("I am doing work getname;");
		return name;
	}
	public void setName(String name) {
		System.out.println("I am doing work setname");
		
		this.name = name;
	}
	public String getServiceCode() {
		System.out.println("I am doing work getservice code");
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		System.out.println("I am doing work setservice code");
		this.serviceCode = serviceCode;
	}
	
}
