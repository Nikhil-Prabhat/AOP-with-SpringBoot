package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;

@Service
@Profile(value= {"local","dev","prod"})
public class UserService {

	@Autowired
	public UserRepository userRepository;

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
