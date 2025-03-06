package com.ryan.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryan.springboot.entities.Order;
import com.ryan.springboot.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repo;
	
	public List<Order> findAll() {
		return repo.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repo.findById(id);
		return obj.get();
	}
}
