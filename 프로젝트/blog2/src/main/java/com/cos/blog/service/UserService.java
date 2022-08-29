package com.cos.blog.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cos.blog.model.RoleType;
import com.cos.blog.model.person;
import com.cos.blog.repository.personRepository;

@Service
public class UserService {

	@Autowired
	private personRepository PersonRepository; 
	
	@Autowired
	private BCryptPasswordEncoder encodeer;
	
	@Transactional
	public void 회원가입(person person) {
		String rawPassword =person.getPassword();
		String encPassword = encodeer.encode(rawPassword);
		person.setPassword(encPassword);
		
		person.setRoles(RoleType.USER);
	
		PersonRepository.save(person);
	}
	
	
	@Transactional
	public void 회원수정(person person) {
		person persistance=PersonRepository.findById(person.getId()).orElseThrow(() ->{
			return new IllegalArgumentException("회원 찾기 실패");
		});
		
		String rawPassword =person.getPassword();
		String encPassword = encodeer.encode(rawPassword);
		persistance.setPassword(encPassword);
		persistance.setEmail(person.getEmail());
		persistance.setAddress(person.getAddress());
		persistance.setTel(person.getTel());
	}
	
	
	@Transactional
	public person 회원찾기(person person) {
		System.out.println(person.getEmail());
		person persistance=PersonRepository.findByEmail(person.getEmail())
				.orElseThrow(() ->{
					return new IllegalArgumentException("회원 찾기 실패");
		});
		return persistance;

	}
	
	@Transactional
	public void 회원탈퇴(int id) {
		PersonRepository.deleteById(id);
	}
	
	
}
