package com.spring.client;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.dao.ProductDao;
import com.spring.model.Product;
import com.spring.config.config;;

public class Client {

	public static void main(String[] args)  throws SQLException {
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		ProductDao dao = (ProductDao) context.getBean("ProductDao");
		
		List<Product> pro=dao.getallProduct();
		for(Product pd:pro){
			System.out.println(pd);		
		}
	}
}
