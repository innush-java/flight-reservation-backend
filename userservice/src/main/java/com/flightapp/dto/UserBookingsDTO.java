package com.flightapp.dto;

import java.util.List;

public class UserBookingsDTO {
	
	private Integer flightid;
	private String flightname;
	private String fromloc;
	private String toloc;
	List<PassengerBooking> passengers;
	private String ticketprice;
	private String journeydate;
	private String bookingdatetime;
	private Integer status;
	private String totalprice;
	private String emailid;
	
	public UserBookingsDTO() {}
	
	public UserBookingsDTO(Integer flightid, String flightname, String fromloc, String toloc,
			List<PassengerBooking> passengers, String ticketprice, String journeydate, String bookingdatetime,
			Integer status, String totalprice, String emailid) {
		super();
		this.flightid = flightid;
		this.flightname = flightname;
		this.fromloc = fromloc;
		this.toloc = toloc;
		this.passengers = passengers;
		this.ticketprice = ticketprice;
		this.journeydate = journeydate;
		this.bookingdatetime = bookingdatetime;
		this.status = status;
		this.totalprice = totalprice;
		this.emailid = emailid;
	}

	public Integer getFlightid() {
		return flightid;
	}

	public void setFlightid(Integer flightid) {
		this.flightid = flightid;
	}

	public String getFlightname() {
		return flightname;
	}

	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}

	public String getFromloc() {
		return fromloc;
	}

	public void setFromloc(String fromloc) {
		this.fromloc = fromloc;
	}

	public String getToloc() {
		return toloc;
	}

	public void setToloc(String toloc) {
		this.toloc = toloc;
	}

	public List<PassengerBooking> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<PassengerBooking> passengers) {
		this.passengers = passengers;
	}

	public String getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(String ticketprice) {
		this.ticketprice = ticketprice;
	}

	public String getJourneydate() {
		return journeydate;
	}

	public void setJourneydate(String journeydate) {
		this.journeydate = journeydate;
	}

	public String getBookingdatetime() {
		return bookingdatetime;
	}

	public void setBookingdatetime(String bookingdatetime) {
		this.bookingdatetime = bookingdatetime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
}
