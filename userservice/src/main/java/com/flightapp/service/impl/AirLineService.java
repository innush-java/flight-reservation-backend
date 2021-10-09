package com.flightapp.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.dto.PassengerBooking;
import com.flightapp.dto.UserBookingsDTO;
import com.flightapp.entities.AirLine;
import com.flightapp.entities.Seats;
import com.flightapp.entities.UserBookings;
import com.flightapp.repo.AirLineRepository;
import com.flightapp.repo.SeatsRepository;
import com.flightapp.repo.UserBookingRepository;

@Service
public class AirLineService {
	
	@Autowired
	AirLineRepository airLineRepo;
	
	@Autowired
	UserBookingRepository userBookingRepo;
	
	@Autowired
	SeatsRepository seatsRepo;
	
	public List<AirLine> getAirLines() {
		return airLineRepo.findAll();
	}
	
	public AirLine searchAirLine(AirLine airLine) {
		airLine = airLineRepo.findByIdOrAirlineName(airLine.getId(), airLine.getAirlineName());
		return airLine;
	}

	public List<UserBookings> bookFlight(UserBookingsDTO userDTO, String flightId) {
		
		List<UserBookings> userBookingsList = new ArrayList<>();
		
//		UserBookingsDTO userDTO = new UserBookingsDTO();
		
		for (PassengerBooking eachPassenger: userDTO.getPassengers()) {
			UserBookings eachTicket = new UserBookings();
			eachTicket.setFlightid(flightId);
			eachTicket.setEmailid(userDTO.getEmailid());
			eachTicket.setFlightname(userDTO.getFlightname());
			eachTicket.setFromloc(userDTO.getFromloc());
			eachTicket.setToloc(userDTO.getToloc());
			eachTicket.setTicketprice(userDTO.getTicketprice());
			eachTicket.setJourneydate(userDTO.getJourneydate());
			eachTicket.setBookingdatetime(userDTO.getBookingdatetime());
			eachTicket.setStatus(1);
			eachTicket.setTotalprice(userDTO.getTotalprice());
			//passenger 
			eachTicket.setSeatnumber(eachPassenger.getSeatnumber());
			eachTicket.setPassengername(eachPassenger.getPassengername());
			eachTicket.setGender(eachPassenger.getGender());
			eachTicket.setAge(eachPassenger.getAge());
			eachTicket.setMealpreference(eachPassenger.getMealpreference());
			
			eachTicket = userBookingRepo.save(eachTicket);
			userBookingsList.add(eachTicket);
		}
		
//		userBookings.setFlightid(flightId);
//		userBookings.setStatus(1);
//		userBookingRepo.save(userBookings);
		return userBookingsList;
	}

	public UserBookings getTicketDetails(Integer pnr) {
		Optional<UserBookings> userBookings = userBookingRepo.findById(pnr);
		return userBookings.get();
	}

	public List<UserBookings> getTicketHistory(String emailId) {
		List<UserBookings> userBookingList = userBookingRepo.findByEmailid(emailId);
		return userBookingList;
	}

	public UserBookings cancelBookedTicket(Integer pnr) {
		Optional<UserBookings> userBookings = userBookingRepo.findById(pnr);
		UserBookings user = new UserBookings();
		if(userBookings.isPresent()) {
			user = userBookings.get();
			user.setStatus(0);
			userBookingRepo.save(user);
		}
		return user;
	}

	public List<Seats> getSeats() {
		return seatsRepo.findAll();
	}

	public List<AirLine> getAirlinesByFromAndTO(AirLine airLine) {
		List<AirLine> airLines = new ArrayList<>();
		airLines = airLineRepo.findByFromlocAndToloc(airLine.getFromloc(), airLine.getToloc());
		return airLines;
	}

}
