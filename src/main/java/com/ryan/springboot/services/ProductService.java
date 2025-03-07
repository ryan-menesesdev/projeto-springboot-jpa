package com.ryan.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryan.springboot.entities.Product;
import com.ryan.springboot.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public List<Product> findAll() {
		return repo.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repo.findById(id);
		return obj.get();
	}
}
