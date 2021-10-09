package com.flightapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airline")
public class AirLine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "airlinename")
	private String airlineName;
	@Column(name = "contactnumber")
	private String contactNumber;
	@Column(name = "contactaddress")
	private String contactAddress;
	private String flightnumber;
	private String fromloc;
	private String toloc;
	private String startdatetime;
	private String enddatetime;
	private String scheduleddays;
	private String instrumentused;
	private Integer busclsseats;
	private Integer nonbusclsseats;
	private String ticketcost;
	private Integer noofrows;
	private String meal;
	private Integer isactive;
	
	public AirLine() {}

	public AirLine(Integer id, String airlineName, String contactNumber, String contactAddress, String flightnumber, String fromloc,
			String toloc, String startdatetime, String enddatetime, String scheduleddays, String instrumentused,
			Integer busclsseats, Integer nonbusclsseats, String ticketcost, Integer noofrows, String meal,
			Integer isactive) {
		super();
		this.id = id;
		this.airlineName = airlineName;
		this.contactNumber = contactNumber;
		this.contactAddress = contactAddress;
		this.flightnumber = flightnumber;
		this.fromloc = fromloc;
		this.toloc = toloc;
		this.startdatetime = startdatetime;
		this.enddatetime = enddatetime;
		this.scheduleddays = scheduleddays;
		this.instrumentused = instrumentused;
		this.busclsseats = busclsseats;
		this.nonbusclsseats = nonbusclsseats;
		this.ticketcost = ticketcost;
		this.noofrows = noofrows;
		this.meal = meal;
		this.isactive = isactive;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
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

	public String getStartdatetime() {
		return startdatetime;
	}

	public void setStartdatetime(String startdatetime) {
		this.startdatetime = startdatetime;
	}

	public String getEnddatetime() {
		return enddatetime;
	}

	public void setEnddatetime(String enddatetime) {
		this.enddatetime = enddatetime;
	}

	public String getScheduleddays() {
		return scheduleddays;
	}

	public void setScheduleddays(String scheduleddays) {
		this.scheduleddays = scheduleddays;
	}

	public String getInstrumentused() {
		return instrumentused;
	}

	public void setInstrumentused(String instrumentused) {
		this.instrumentused = instrumentused;
	}

	public Integer getBusclsseats() {
		return busclsseats;
	}

	public void setBusclsseats(Integer busclsseats) {
		this.busclsseats = busclsseats;
	}

	public Integer getNonbusclsseats() {
		return nonbusclsseats;
	}

	public void setNonbusclsseats(Integer nonbusclsseats) {
		this.nonbusclsseats = nonbusclsseats;
	}

	public String getTicketcost() {
		return ticketcost;
	}

	public void setTicketcost(String ticketcost) {
		this.ticketcost = ticketcost;
	}

	public Integer getNoofrows() {
		return noofrows;
	}

	public void setNoofrows(Integer noofrows) {
		this.noofrows = noofrows;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public Integer getIsactive() {
		return isactive;
	}

	public void setIsactive(Integer isactive) {
		this.isactive = isactive;
	}
	
	
}
