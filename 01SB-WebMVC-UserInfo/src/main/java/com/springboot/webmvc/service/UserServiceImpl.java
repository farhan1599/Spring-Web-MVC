package com.springboot.webmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.webmvc.entity.UserEntity;
import com.springboot.webmvc.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	// add or update user
	@Override
	public UserEntity saveUser(UserEntity user) {
		return userRepo.save(user);

	}

	// to get all users
	@Override
	public List<UserEntity> getAllUsers() {
		return userRepo.findAll();

	}

	
}
