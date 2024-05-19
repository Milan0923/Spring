package com.spring.frame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.frame.config;
import com.spring.frame.Customer;
import com.spring.frame.Address;
import com.spring.frame.MyDate;

public class Client {

	public static void main(String[] args) {
		ApplicationContext factory=new AnnotationConfigApplicationContext(config.class);
		Customer ob1=(Customer) factory.getBean("cust");
		System.out.println(ob1);
	}
}
