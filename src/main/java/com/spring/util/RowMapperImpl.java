package com.spring.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.model.Product;

public class RowMapperImpl implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product product=new Product();
		product.setId(rs.getInt(1));
		product.setName(rs.getString(2));
		product.setPrice(rs.getDouble(3));
		product.setDescription(rs.getString(4));
		return product;
	}

}
