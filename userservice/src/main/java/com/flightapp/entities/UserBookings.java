package com.flightapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_bookings")
public class UserBookings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String flightid;
	private String flightname;
	private String fromloc;
	private String toloc;
	private String seatnumber;
	private String passengername;
	private String gender;
	private String age;
	private String ticketprice;
	private String journeydate;
	private String bookingdatetime;
	private Integer status;
	private String mealpreference;
	private String totalprice;
	private String emailid;
	
	public UserBookings() {}
	
	public UserBookings(Integer id, String flightid, String flightname, String fromloc, String toloc, String seatnumber,
			String passengername, String gender, String age, String ticketprice, String journeydate,
			String bookingdatetime, Integer status, String mealpreference, String totalprice, String emailid) {
		super();
		this.id = id;
		this.flightid = flightid;
		this.flightname = flightname;
		this.fromloc = fromloc;
		this.toloc = toloc;
		this.seatnumber = seatnumber;
		this.passengername = passengername;
		this.gender = gender;
		this.age = age;
		this.ticketprice = ticketprice;
		this.journeydate = journeydate;
		this.bookingdatetime = bookingdatetime;
		this.status = status;
		this.mealpreference = mealpreference;
		this.totalprice = totalprice;
		this.emailid = emailid;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
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
	public String getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(String seatnumber) {
		this.seatnumber = seatnumber;
	}
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
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
	public String getMealpreference() {
		return mealpreference;
	}
	public void setMealpreference(String mealpreference) {
		this.mealpreference = mealpreference;
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

	public String getToloc() {
		return toloc;
	}

	public void setToloc(String toloc) {
		this.toloc = toloc;
	}
	
	
}
