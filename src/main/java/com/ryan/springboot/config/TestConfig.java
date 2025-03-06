package com.ryan.springboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ryan.springboot.entities.User;
import com.ryan.springboot.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) {
		User u1 = new User(null, "Pedro", "pedro@gmail.com", "352323523", "senha");
		User u2 = new User(null, "Lucas", "lucas@gmail.com", "352323333", "senha321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
