package com.spring.model;

public class ClientCode {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("  "));
		Customer ob1 = (Customer) factory.getBean("cust1");
		System.out.println(ob1);
		System.out.println("--------------------------------------------------------");
		Customer ob2 = (Customer) factory.getBean("cust2");
		System.out.println(ob2);
	}
}
