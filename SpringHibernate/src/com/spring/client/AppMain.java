package com.spring.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.config.HibernateConfiguration;
import com.spring.dao.BookDAO;
import com.spring.model.Book;


public class AppMain {

	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfiguration.class);

		BookDAO dao = (BookDAO) context.getBean("bookdao");
		//save		
		dao.addBook(new Book(1,"Head First Java","KS","Avani",780));
		dao.addBook(new Book(2,"Complete Ref","HS","BPB",990));
		dao.addBook(new Book(3,"Thinking java","KS","Avani",1000));

		/*
		 * Get all 
		 */
		List<Book> booklist=dao.getAllBooks();
		for(Book b:booklist)
			System.out.println(b);
		
		
		List titles=dao.getTitles();
		for(Object t:titles)
			System.out.println(t);
		
		
		
		dao.updateBook(3, 1500);
		dao.deleteBook(2);

		
	}
}
