package com.spring.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bk")
@Scope("prototype")
public class Book {

	private int code;
	private String title,author;
	private double price;
	public Book() {
		super();
		System.out.println("Book default ctor..");
		// TODO Auto-generated constructor stub
	}
	public Book(int code, String title, String author, double price) {
		super();
		System.out.println("Book para ctor..");
		this.code = code;
		this.title = title;
		this.author = author;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [code=" + code + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
}
