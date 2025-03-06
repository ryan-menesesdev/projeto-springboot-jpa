package com.ryan.springboot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ryan.springboot.entities.Order;
import com.ryan.springboot.entities.User;
import com.ryan.springboot.repositories.OrderRepository;
import com.ryan.springboot.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) {
		User u1 = new User(null, "Pedro", "pedro@gmail.com", "352323523", "senha");
		User u2 = new User(null, "Lucas", "lucas@gmail.com", "352323333", "senha321");
		
		Order o1 = new Order(null, Instant.parse("2025-05-31T18:00:00Z"), u1);
		Order o2 = new Order(null, Instant.parse("2025-05-28T14:05:00Z"), u2);
		Order o3 = new Order(null, Instant.parse("2025-05-24T18:30:00Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
