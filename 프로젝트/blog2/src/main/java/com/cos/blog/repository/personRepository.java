package com.cos.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cos.blog.model.person;

@Repository
public interface personRepository extends JpaRepository<person,Integer>{
//person findByUsernameAndPassword(String username,String password);
	Optional<person> findByUsername(String username);
}
