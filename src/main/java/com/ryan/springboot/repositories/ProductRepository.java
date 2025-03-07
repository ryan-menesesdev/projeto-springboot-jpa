package com.ryan.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ryan.springboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
