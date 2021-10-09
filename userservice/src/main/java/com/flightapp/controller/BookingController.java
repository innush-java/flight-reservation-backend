package com.flightapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.dto.UserBookingsDTO;
import com.flightapp.entities.AirLine;
import com.flightapp.entities.Seats;
import com.flightapp.entities.UserBookings;
import com.flightapp.service.impl.AirLineService;

@RestController
@RequestMapping("/api/v1.0/flight")
public class BookingController {
	
	@Autowired
	AirLineService airLineService;
	
	@GetMapping("/airlines")
	public List<AirLine> getAirLines() {
		return airLineService.getAirLines();
	}
	
	@PostMapping("/search")
	public AirLine searchAirLine(@RequestBody AirLine airLine) {
		return airLineService.searchAirLine(airLine);
	}
	
	@PostMapping("/booking/{flightId}")
	public List<UserBookings> bookFlight(@RequestBody UserBookingsDTO userDTO, @PathVariable("flightId") String flightId) {
		return airLineService.bookFlight(userDTO, flightId);
	}
	
	@GetMapping("/ticket/{pnr}")
	public UserBookings getTicketDetails(@PathVariable("pnr") Integer pnr) {
		return airLineService.getTicketDetails(pnr);
	}
	
	@DeleteMapping("/booking/cancel/{pnr}")
	public UserBookings cancelBookedTicket(@PathVariable("pnr") Integer pnr) {
		return airLineService.cancelBookedTicket(pnr);
	}
	
	@GetMapping("/booking/history/{emailId}")
	public List<UserBookings> getTicketDetails(@PathVariable("emailId") String emailId) {
		return airLineService.getTicketHistory(emailId);
	}
	
	@GetMapping("/seats")
	public List<Seats> getSeats() {
		return airLineService.getSeats();
	}
	
	@PostMapping("/airlinesbyfromandto")
	public List<AirLine> getAirlinesByFromAndTO(@RequestBody AirLine airLine) {
		return airLineService.getAirlinesByFromAndTO(airLine);
	}
}
