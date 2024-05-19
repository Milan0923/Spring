package com.spring.model;

public class Product {

	private int code;
	private String title;
	private double price;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int code, String title, double price) {
		super();
		this.code = code;
		this.title = title;
		this.price = price;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", title=" + title + ", price=" + price + "]";
	}

	
}
