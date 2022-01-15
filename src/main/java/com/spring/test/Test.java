package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.ProductDao;
import com.spring.model.Product;

public class Test {

	public static void main(String args[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/test/config.xml");

		ProductDao productDao = (ProductDao) ac.getBean("productDaoImpl");

		Product product = new Product();

		//======== Add New Product=======//
		// product.setId(1);
//		product.setName("I Phone XR");
//		product.setPrice(37000);
//		product.setDescription("64gb Internal");
//		
//		productDao.addNewProduct(product);
//		System.out.println("New Product Added -ID:: "+product.getId());
		
		//======== Update Product=======//
//		product.setId(1);
//		product.setName("I PHONE XR");
//		product.setPrice(36800);
//		product.setDescription("64 gb Internal Memory");
//
//		productDao.updateProduct(product);
//		System.out.println("<==== Update Product Succesfully ====>"+product.getId());
		
		//======= Fetch Product =======//
		
//		productDao.fetchAll();
//		System.out.println(productDao.fetchAll());
		
		
		//====== Find By Id ==========//
//		productDao.findById(1);
//		System.out.println(productDao.findById(1));
		
		//==== Delete Product=====//
		

		System.out.println("=== Delete Product Succesfully"+productDao.deleteProduct(1));
	}
}
