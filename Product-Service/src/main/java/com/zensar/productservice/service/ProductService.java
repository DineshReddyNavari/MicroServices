package com.zensar.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.productservice.entity.Product;


public interface ProductService {
	
	public Product insertProduct(Product product);
	
	public List<Product> getProduct();
	
	public Product updateProduct(int productId,Product product);
	 
	public String deleteProduct();
	

}
