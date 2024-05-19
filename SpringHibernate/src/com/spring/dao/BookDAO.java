package com.spring.dao;

import java.util.List;

import com.spring.model.Book;
//DAO interface
public interface BookDAO {
	public Book findById(int id);	
	public Book getBookInfo(int id);
	public void addBook(Book bk);
	public void updateBook(int id,double newprice);
	public void deleteBook(int id);
	public List<Book> getAllBooks();
	public List getTitles();

}
