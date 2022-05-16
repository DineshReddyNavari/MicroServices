package com.zensar.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.productservice.entity.Product;
import com.zensar.productservice.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository repository;

	@Override
	public Product insertProduct(Product product) {
		
		return repository.save(product);
	}

	@Override
	public List<Product> getProduct() {
		
		return repository.findAll();
	}

	@Override
	public Product updateProduct(int productId,Product product) {
		Product product1 = new Product();
		product1.setProductId(product.getProductId());
		product1.setProductName(product.getProductName());
		product1.setPrice(product.getPrice());
		product1.setDiscription(product.getDiscription());
		return product1;
	}

	@Override
	public String deleteProduct() {
		repository.deleteAll();
		return "Deleted All Products";
	}

}
