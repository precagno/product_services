package com.precagno.product.services.product_services.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.precagno.product.services.product_services.product.dto.Product;

public class ProductDAOImpl implements ProductDAO {
	Map<Integer,Product> products;
	
	public ProductDAOImpl() {
		this.products=new HashMap<>();
	}
	@Override
	public void create(Product product) {
		this.products.put(product.getId(),product);
	}
	@Override
	public Product read(int id) {
		return this.products.get(id);
	}
	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
	}
}