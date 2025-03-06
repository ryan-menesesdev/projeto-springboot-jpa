package com.ryan.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ryan.springboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
