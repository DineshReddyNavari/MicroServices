package com.zensar.productservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ComponentScan
@Entity
@Table(name = "product")

public class Product {

	@javax.persistence.Id

	@GeneratedValue(strategy = GenerationType.AUTO)

	private int productId;
	private String productName;
	private String discription;
	private Double price;

}
