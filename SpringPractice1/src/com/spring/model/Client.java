package com.spring.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.config;

public class Client {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext factory=new AnnotationConfigApplicationContext(config.class);
		
		Instrumentalist i1=(Instrumentalist) factory.getBean("i1");
		i1.perform();
		Instrumentalist i2 = (Instrumentalist) factory.getBean("i2");
		i2.perform();
		Instrumentalist i3 = (Instrumentalist) factory.getBean("i3");
		i3.perform();
	}
}
