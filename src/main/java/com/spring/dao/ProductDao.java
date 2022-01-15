package com.spring.dao;

import java.util.List;

import com.spring.model.Product;

public interface ProductDao {

	String addNewProduct(Product product);
	
	String updateProduct(Product product);
	
	List<Product> fetchAll();
	
	Product findById(int id);
	
	String deleteProduct(int id);
}
