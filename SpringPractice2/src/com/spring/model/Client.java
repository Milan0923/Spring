package com.spring.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.model.config;
import com.spring.model.Product;
import com.spring.model.Book;
public class Client {

	public static void main(String[] args) {
		ApplicationContext factory=new AnnotationConfigApplicationContext(config.class);
		Product ob1=(Product) factory.getBean("pd");
		Product ob2=(Product) factory.getBean("pd");
		System.out.println(ob1);
		System.out.println(ob2);
		
		Book  bk1=(Book) factory.getBean("bk",1,"Let Us C","YK",890);	
		Book bk2=(Book) factory.getBean("bk",2,"Thinking in Java","KS",990);
		System.out.println(bk1);
		System.out.println(bk2);
	}

}
