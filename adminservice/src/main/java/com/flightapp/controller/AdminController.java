package com.flightapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.dto.UserDTO;
import com.flightapp.entities.AirLine;
import com.flightapp.service.AdminService;

@RestController
@RequestMapping("/api/v1.0/flight")
public class AdminController {
	
	@Autowired
	AdminService adminService;

	@PostMapping("/airline/register")
	public AirLine register(@RequestBody AirLine airLine) {
		return adminService.registerAirLine(airLine);
	}
	
	@PostMapping("/airline/inventory/add/{id}")
	public AirLine updateAirLine(@RequestBody AirLine airLine, @PathVariable("id") Integer id) {
		return adminService.updateAirLine(airLine, id);
	}
	
	@PostMapping("/admin/loginc1c")
	public String adminLogin(@RequestBody UserDTO userDTO) {
		return adminService.login(userDTO);
	}
}
