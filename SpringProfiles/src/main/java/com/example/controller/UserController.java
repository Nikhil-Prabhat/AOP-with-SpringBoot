package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/get")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

}
