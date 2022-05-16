package com.zensar.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.productservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
