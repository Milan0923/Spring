package com.spring.dao;

import java.util.List;

import com.spring.model.Product;

public interface ProductDao {

	public int addProduct(Product pd);
	public int updateProduct(int id,double newprice);
	public int deleteProduct(int id);
	public List<Product> getAllProducts();
	public List<String> getAllProNames();
	
}
