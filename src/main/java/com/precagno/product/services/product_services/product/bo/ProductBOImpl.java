package com.precagno.product.services.product_services.product.bo;

import com.precagno.product.services.product_services.product.dao.ProductDAOImpl;
import com.precagno.product.services.product_services.product.dto.Product;

public class ProductBOImpl implements ProductBO{

	ProductDAOImpl dao;
	
	@Override
	public void create(Product product) {
		this.dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return this.dao.read(id);
	}
}