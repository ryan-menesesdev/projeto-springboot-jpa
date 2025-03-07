package com.ryan.springboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ryan.springboot.entities.Product;
import com.ryan.springboot.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService serv;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = serv.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = serv.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
