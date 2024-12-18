package com.springboot.webmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.webmvc.entity.UserEntity;
import com.springboot.webmvc.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	// show from to add a new user
	@GetMapping("/user-form")
	public String showUserForm(Model model) {
		model.addAttribute("user", new UserEntity());
		return "user-form"; // view name
	}

	@PostMapping("/save-user")
	public String saveUser(@ModelAttribute("user") UserEntity user) {
		userService.saveUser(user);
       return "redirect:/users";

	}

	// display all users
	@GetMapping("/users")
	public String listUsers(Model model) {
		List<UserEntity> users = userService.getAllUsers();
		model.addAttribute("users", users);
		return "user-list";
	}

}
