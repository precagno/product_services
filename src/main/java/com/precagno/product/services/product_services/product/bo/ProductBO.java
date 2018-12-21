package com.precagno.product.services.product_services.product.bo;

import com.precagno.product.services.product_services.product.dto.Product;

public interface ProductBO {
	public void create(Product product);
	public Product findProduct(int id);
}
