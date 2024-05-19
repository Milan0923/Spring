package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.model.Product;

public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbctemplate;
	}
	
	@Override
	public int addProduct(Product pd) {
		String sql="insert into Product values(?,?,?)";
		int r= jdbctemplate.update(sql, new Object[]{pd.getProductId(),pd.getName(),pd.getPrice()});
		return r;
	}

	@Override
	public List<Product> getallProduct() {
		String sql="select * from Product";
		
		List<Product> ProductList=jdbctemplate.query(sql,new RowMapper<Product>(){

			@Override
			public Product mapRow(ResultSet rs, int rownum)
					throws SQLException {
				
				Product pd=new Product();
				pd.setProductId(rs.getInt("code"));
				pd.setName(rs.getString("Name"));
				pd.setPrice(rs.getDouble("price"));
				return pd;
			}		
		});	
			
		return ProductList;
	}

}
