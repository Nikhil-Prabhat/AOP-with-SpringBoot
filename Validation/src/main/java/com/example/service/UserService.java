package com.example.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.UserRequest;
import com.example.entity.User;
import com.example.exception.UserNotFoundException;
import com.example.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User saveUser(UserRequest userRequest) {
		// build in dto is used for builder patern

		User user = User.build(0, userRequest.getUsername(), userRequest.getEmail(), userRequest.getMobileNo(),
				userRequest.getNationality(), userRequest.getAge(), userRequest.getNationality());
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUser(int id) throws UserNotFoundException {
		User user = userRepository.findById(id).orElse(null);
		if (user != null)
			return user;
		else
			throw new UserNotFoundException("User not found with id " + id);
	}

}
