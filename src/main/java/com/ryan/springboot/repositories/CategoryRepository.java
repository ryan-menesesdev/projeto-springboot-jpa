package com.ryan.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ryan.springboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
