package com.spring.dao;

import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.Product;

@Transactional
@Repository("Productdao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public int addProduct(Product pd) {
		getSession().save(pd);
		return 0;
	}

	@Override
	public int updateProduct(int id, double newprice) {
		Product pd = (Product) getSession().get(Product.class, id);
		pd.setPrice(newprice);
		getSession().update(pd);
		return id;
	}

	@Override
	public int deleteProduct(int id) {
		Product p = (Product) getSession().get(Product.class, id);
		getSession().delete(p);
		return id;
	}

	@Override
	public List<Product> getAllProducts() {
		Query q = (Query) getSession().createQuery("from Product p");		
		List<Product> pt =  q.list();
		return pt;
	}

	@Override
	public List<String> getAllProNames() {
		Query q = getSession().createQuery("select p.name from Product p");
		List<String> pt= q.list();
		return pt;
	}

	
}