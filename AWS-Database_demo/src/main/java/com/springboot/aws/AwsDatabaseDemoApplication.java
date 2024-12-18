package com.springboot.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.aws.service.StudentService;

@SpringBootApplication
public class AwsDatabaseDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AwsDatabaseDemoApplication.class, args);
		StudentService studentService = context.getBean(StudentService.class);
		studentService.saveStudent();
	}

}
