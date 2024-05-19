package com.spring.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.HibernateConfig;
import com.spring.dao.ProductDao;
import com.spring.model.Product;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		ProductDao dao = (ProductDao) context.getBean("Productdao");
		
		dao.addProduct(new Product(1,"HRX",999));
		dao.addProduct(new Product(2,"Rodstar",1499));
		dao.addProduct(new Product(3,"H&M",1999));
		
		List<Product> Productlist = dao.getAllProducts();
		for(Product p:Productlist)
			System.out.println(p);
		
		List ProNames = dao.getAllProNames();
		for(Object n:ProNames)
			System.out.println(n);
		
//		dao.updateProduct(3, 1897);
//		dao.deleteProduct(1);
	}
}
