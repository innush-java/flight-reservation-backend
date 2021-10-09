package com.flightapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.dto.UserDTO;
import com.flightapp.entities.User;
import com.flightapp.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public UserDTO register(UserDTO userDTO) {
		User user = new User();
		user.setFirstName(userDTO.getFirstName());
		user.setLastName(userDTO.getLastName());
		user.setAddress(userDTO.getAddress());
		user.setContactNumber(userDTO.getContactNumber());
		user.setEmail(userDTO.getEmail());
		user.setPassword(userDTO.getPassword());
		user.setUserName(userDTO.getUserName());
		user.setRole("user");
		user = userRepo.save(user);
		userDTO.setId(user.getId());
		return userDTO;
	}
	
	public String login(UserDTO userDTO) {
		//User user = userRepo.findByUserNameAndPassword(userDTO.getUserName(), userDTO.getPassword());
		User user = userRepo.findByUserName(userDTO.getUserName());
		if(user == null) {
			return "User doesn't exist";
		} 
		
		if(!user.getPassword().equals(userDTO.getPassword())) {
			return "Password mismatch";
		}
		return "Login Success";
	}

}
