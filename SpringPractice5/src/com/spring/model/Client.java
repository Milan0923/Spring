package com.spring.model;

import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class Client {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("./src/springConfig.xml"));
		Customer ob1 = (Customer) factory.getBean("cust1");
		System.out.println(ob1);
		System.out.println("--------------------------------------------------------");
		Customer ob2 = (Customer) factory.getBean("cust2");
		System.out.println(ob2);
	}
}
