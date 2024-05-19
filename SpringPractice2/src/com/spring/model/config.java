package com.spring.model;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ComponentScan;

import com.spring.model.Product;

@Configuration
@ComponentScan("com.spring.model")
public class config {

	@Bean(name="pd")
	@Scope("prototype")
	public Product mymethod() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Product Code=");
		int cd=sc.nextInt();
		sc=new Scanner(System.in);
		System.out.println("Product Title=");
		String tt=sc.nextLine();
		System.out.println("Product Price=");
		double pr=sc.nextDouble();		
		
		Product obj=new Product(cd,tt,pr);		
		return obj;
	}
}

