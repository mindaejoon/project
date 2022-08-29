package com.cos.blog.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cos.blog.repository.personRepository;

@Controller
public class UserController {
	@Autowired
	private personRepository personRepository;
	@GetMapping("/auth/joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	
	@GetMapping("/auth/loginForm")
	public String loginForm() {
		return "user/loginForm";
	}
	
	@GetMapping("/user/updateForm")
	public String updateForm() {
		return "user/updateForm";
	}
	
	@GetMapping("/auth/findId")
	public  String findId() {
		return "user/findId";
	}
	
	@GetMapping("/auth/findpwd")
	public  String findpwd() {
		return "user/findpwd";
	}
	
	

	
}
