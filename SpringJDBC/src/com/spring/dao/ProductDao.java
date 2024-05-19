package com.spring.dao;

import java.util.List;

import com.spring.model.Product;

public interface ProductDao {

	public int addProduct(Product pd);
	public List<Product> getallProduct();
}
