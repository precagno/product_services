package com.precagno.product.services.product_services;

import static org.junit.Assert.*;

import org.junit.Test;

import com.precagno.product.services.product_services.product.dao.ProductDAOImpl;
import com.precagno.product.services.product_services.product.dto.Product;

public class DAOTest {
	private ProductDAOImpl prodDao;
	
	public DAOTest() {
		this.prodDao=new ProductDAOImpl();
	}
	
	@Test
	public void testCreateProduct() {
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("New Iphone X");
		product.setPrice(4000);
		
		this.prodDao.create(product);
		
		Product saved=this.prodDao.read(1);
		
		assertNotNull(saved);
		assertEquals("Iphone",saved.getName());
		
	}
}