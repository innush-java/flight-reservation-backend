package com.flightapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.dto.UserDTO;
import com.flightapp.entities.AirLine;
import com.flightapp.entities.User;
import com.flightapp.repo.AirLineRepository;
import com.flightapp.repo.UserRepository;

@Service
public class AdminService {
	
	@Autowired
	AirLineRepository airLineRepo;
	
	@Autowired
	UserRepository userRepo;
	
	public AirLine registerAirLine(AirLine airLine) {
		return airLineRepo.save(airLine);
	}

	public AirLine updateAirLine(AirLine airLine, Integer id) {
		
		Optional<AirLine> existing = airLineRepo.findById(id);
		if(existing.isPresent()) {
			airLine.setId(id);
			airLineRepo.save(airLine);
		}
		return airLine;
	}

	
	public String login(UserDTO userDTO) {
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
