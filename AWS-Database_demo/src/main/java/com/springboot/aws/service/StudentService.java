package com.springboot.aws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.aws.entity.StudentEntity;
import com.springboot.aws.repository.StudentRepository;

@Service
public class StudentService {
  
	@Autowired
	private StudentRepository studentRepo;
	
	
	public void saveStudent() {
		StudentEntity student = new StudentEntity();
		student.setName("Allen");
		student.setRollno(12);
		student.setCity("HYD");
		
		StudentEntity saved = studentRepo.save(student);
		if(saved != null) {
			System.out.println("record saved into DB..");
			
		}else {
			System.out.println("not inserted !!");
		}
		
		
	}
}
