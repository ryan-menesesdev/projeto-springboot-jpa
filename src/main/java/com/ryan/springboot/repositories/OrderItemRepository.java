package com.ryan.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ryan.springboot.entities.OrderItem;
import com.ryan.springboot.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
