package com.springboot.webmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.webmvc.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
