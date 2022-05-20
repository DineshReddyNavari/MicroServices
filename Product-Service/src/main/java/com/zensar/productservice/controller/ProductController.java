package com.zensar.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.productservice.entity.Product;
import com.zensar.productservice.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping("/")
	public Product insertProduct(@RequestBody Product product) {
		Product insertProduct = service.insertProduct(product);
		return insertProduct;
	}
	
	@GetMapping("/")
	public List<Product> getProduct(){
		return service.getProduct();
		
	}
	
	@PutMapping("/{productId}")
	public Product updateProduct(@PathVariable int productId,@RequestBody Product product) {
		
		return service.updateProduct(productId, product);
		
	}
	@DeleteMapping("/")
	public String deleteProduct() {
		service.deleteProduct();
		return "product Deleted ";
	}

}
