package com.example.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springmvc.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

	//List<Product> findAll(Pageable pageable);
	
}
