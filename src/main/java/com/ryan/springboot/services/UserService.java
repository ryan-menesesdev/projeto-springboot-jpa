package com.ryan.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryan.springboot.entities.User;
import com.ryan.springboot.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repo.findById(id);
		return obj.get();
	}
	
	public User insertUser(User user) {
		return repo.save(user);
	}
	
	public void deleteUser(Long id) {
		repo.deleteById(id);
	}
	
	private void updateData(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
	}
	
	public User updateUser(Long id, User user) {
		User entity = repo.getReferenceById(id);
		updateData(entity, user);
		return repo.save(entity);
	}
}
