package com.spring.util;

public class DBquries {

	public static final String ADD_NEW_PRODUCT="insert into products values(?,?,?,?)";
	
	public static final String UPDATE_PRODUCT="update products set name=?,price=?,description=? where id=?";
	
	public static final String FETCH_ALL="select * from products";
	
	public static final String FIND_BY_ID="select * from products where id=?";
	
	public static final String DELETE_BY_ID="delete from products where id=?";
}
