package com.springboot.webmvc.service;

import java.util.List;
import java.util.Optional;

import com.springboot.webmvc.entity.UserEntity;

public interface UserService {

	public UserEntity saveUser(UserEntity userEntity);

	public List<UserEntity> getAllUsers();

	
}
