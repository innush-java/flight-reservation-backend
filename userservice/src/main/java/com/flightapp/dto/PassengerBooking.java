package com.flightapp.dto;

public class PassengerBooking {
	
	private String seatnumber;
	private String passengername;
	private String gender;
	private String age;
	private String mealpreference;
	
	public PassengerBooking() {}
	
	public PassengerBooking(String seatnumber, String passengername, String gender, String age, String mealpreference) {
		super();
		this.seatnumber = seatnumber;
		this.passengername = passengername;
		this.gender = gender;
		this.age = age;
		this.mealpreference = mealpreference;
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

	public String getMealpreference() {
		return mealpreference;
	}

	public void setMealpreference(String mealpreference) {
		this.mealpreference = mealpreference;
	}
	
	

}
