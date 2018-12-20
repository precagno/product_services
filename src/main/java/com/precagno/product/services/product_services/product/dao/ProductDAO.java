package com.precagno.product.services.product_services.product.dao;

import com.precagno.product.services.product_services.product.dto.Product;

public interface ProductDAO {
	void create(Product product);
	Product read(int id);
	void update(Product product);
	void delete(int id);
}