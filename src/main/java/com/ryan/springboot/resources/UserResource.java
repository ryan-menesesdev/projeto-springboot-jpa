package com.ryan.springboot.resources;

import com.ryan.springboot.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Jorge", "jorge@gmail.com", "91283917231", "senha");
		return ResponseEntity.ok().body(u);
	}
}
