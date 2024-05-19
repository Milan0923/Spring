package com.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.Book;

@Transactional
@Repository("bookdao")
public class BookDAOImpl implements BookDAO{
	@Autowired
	private SessionFactory sessionFactory;

	
//This method will be invoked again and again 
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
		
	@Override
	public void addBook(Book bk) {	
		getSession().save(bk);		
	}
	
	@Override
	public Book getBookInfo(int id) {
		// TODO Auto-generated method stub
		return (Book) getSession().get(Book.class, id);
	}
	@Override
	public Book findById(int id) {	
		Book bk=(Book)getSession().get(Book.class, id);
		return bk;
	}
	@Override
	public void updateBook(int id,double newprice) {
		Book bk=(Book)getSession().get(Book.class, id);
		bk.setPrice(newprice);
		getSession().update(bk);
	}

	@Override
	public void deleteBook(int id) {
		Book b = (Book) getSession().get(Book.class,id);
		getSession().delete(b); 
	}

	@Override
	public List<Book> getAllBooks() {
		//using from clause
		Query q=getSession().createQuery("from Book b");		
		List<Book> lst =q.list();
		return lst;
	}

	@Override
	public List<String> getTitles() {
		//using select clause
		Query q=getSession().createQuery("select b.title from Book b");
		List<String> lst=q.list();
		return lst;
	}

	

}










