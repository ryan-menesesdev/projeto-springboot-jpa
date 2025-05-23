package com.ryan.springboot.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ryan.springboot.entities.User;
import com.ryan.springboot.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService serv;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = serv.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = serv.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<User> insert(@RequestBody User user) {
		user = serv.insertUser(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(uri).body(user);
	}
	
	@DeleteMapping(value ="/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		serv.deleteUser(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user) {
		user = serv.updateUser(id, user);
		return ResponseEntity.ok().body(user);
	}
}
