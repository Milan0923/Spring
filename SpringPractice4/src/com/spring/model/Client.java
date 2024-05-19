package com.spring.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.model.config;
import com.spring.model.Flute;
import com.spring.model.instrumtalist;
import com.spring.model.Guitar;
public class Client {

	public static void main(String[] args) {
		ApplicationContext factory=new AnnotationConfigApplicationContext(config.class);
		
		
		Guitar g=(Guitar) factory.getBean("Guitar");
//		instrumtalist ob2=(instrumtalist) factory.getBean("instrumtalist",g);
//		ob2.play();
//		
//		Flute f=(Flute) factory.getBean("Flute");
//		instrumtalist ob3=(instrumtalist) factory.getBean("instrumtalist",f);
//		ob3.play();
		
		instrumtalist ob1=(instrumtalist) factory.getBean("instr","song",g);
		ob1.play();
	}
}
