package com.flightapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.dto.UserDTO;
import com.flightapp.service.impl.UserService;

@RestController
@RequestMapping("/api/v1.0/flight/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public UserDTO register(@RequestBody UserDTO userDTO) {
		return userService.register(userDTO);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody UserDTO userDTO) {
		return userService.login(userDTO);
	}
	

}
