package com.beater.spring.beans.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.beater.spring.beans.annotation.service.UserService;

@Controller
public class UserController {
	//@Autowired
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("excute...");
		userService.add();
	}
}
