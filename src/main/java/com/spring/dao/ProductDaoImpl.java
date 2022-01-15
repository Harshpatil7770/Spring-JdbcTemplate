package com.spring.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.Product;
import com.spring.util.DBquries;
import com.spring.util.RowMapperImpl;
@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public String addNewProduct(Product product) {
		// TODO Auto-generated method stub
		int result= jdbcTemplate.update(DBquries.ADD_NEW_PRODUCT,product.getId(),product.getName(),product.getPrice(),
				product.getDescription());
		if(result!=0) {
			return "===== New Product Added====";
		}
		return null;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
		int result= jdbcTemplate.update(DBquries.UPDATE_PRODUCT,product.getName(),product.getPrice(),product.getDescription(),
				product.getId());
		if(result!=0) {
			return "===== Update Product Succesfully =====";
		}
		return null;
	}


	@Override
	public List<Product> fetchAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(DBquries.FETCH_ALL,(ResultSet rs)->{
			List<Product> list=new ArrayList<Product>();
			while(rs.next()) {
				Product product=new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				product.setDescription(rs.getString(4));
				
				list.add(product);
			}
			return list;
		});
	}


	@Override
	public Product findById(int id) {
		RowMapperImpl rowMapper=new RowMapperImpl();
		return jdbcTemplate.queryForObject(DBquries.FIND_BY_ID,rowMapper,id);
	}


	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		int result= jdbcTemplate.update(DBquries.DELETE_BY_ID,id);
		if(result!=0) {
			return "==== Delete Product Succesfully ====";
		}
		return null;
	}

	
}
