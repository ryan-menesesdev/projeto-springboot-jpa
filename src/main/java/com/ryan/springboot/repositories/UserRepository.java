package com.ryan.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ryan.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
