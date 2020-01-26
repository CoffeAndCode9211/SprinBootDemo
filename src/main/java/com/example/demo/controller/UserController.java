package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.User;

@RestController
public class UserController {

	
	@GetMapping("/user")
	public List<User> getUserDetail(){
		List<User> lstUser = new ArrayList<>();
		User user1 = new User("Test", "1", "test123");
		User user2 = new User("James", "2", "james123");
		User user3 = new User("Hello", "3", "hello123");
		lstUser.add(user1);
		lstUser.add(user2);
		lstUser.add(user3);
		return lstUser;
	}
	
}
