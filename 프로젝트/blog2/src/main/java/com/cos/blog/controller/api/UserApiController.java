package com.cos.blog.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.dto.ResponseDto;
import com.cos.blog.model.person;
import com.cos.blog.service.UserService;

@RestController
public class UserApiController {
	@Autowired
	private UserService userService;
	@PostMapping("/auth/joinProc")
	public ResponseDto<Integer> save(@RequestBody person person){
		System.out.println("UserApiController호출됨");
		
//		person.setRoles(RoleType.USER);
		
		userService.회원가입(person);
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
	}
	
	
	@PutMapping("/user")
	public ResponseDto<Integer> update(@RequestBody person person){
		userService.회원수정(person);
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
	}
	
//	@PostMapping("/api/user/login")
//	public ResponseDto<Integer> login(@RequestBody person person,HttpSession session){
//		System.out.println("UserApiController :login 호출됨");
//		person principal= userService.로그인(person);
//		
//		if(principal !=null) {
//			session.setAttribute("principal", principal);
//		}
//		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
//	}
}
