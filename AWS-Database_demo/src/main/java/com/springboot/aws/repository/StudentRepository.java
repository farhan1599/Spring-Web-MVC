package com.springboot.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.aws.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
