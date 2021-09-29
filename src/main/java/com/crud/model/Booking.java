package com.crud.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="booking")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	
	@Column
	private String flightCode;
	
	@Column
	private String flightName;
	
	@Column
	private String flightDate;
	
	@Column
	private String flightTime;
	
	@Column
	private String start;
	
	@Column
	private String destination;
	
	@Column
	private String totalFare;
	
	@Column
	private String seatName;
	
	@Column
	private String passenger_name;
	
	@Column
	private String passport;
	
	@Column
	private String email;
	
	@Column
	private String contact;
	
	@Column
	private String transactionId;
	
	public Booking() {
		super();
	}

	public Booking(long id, String flightCode, String flightName, String flightDate, String flightTime, String start,
			String destination, String totalFare, String seatName, String passenger_name, String passport, String email,
			String contact, String transactionId) {
		super();
		this.id = id;
		this.flightCode = flightCode;
		this.flightName = flightName;
		this.flightDate = flightDate;
		this.flightTime = flightTime;
		this.start = start;
		this.destination = destination;
		this.totalFare = totalFare;
		this.seatName = seatName;
		this.passenger_name = passenger_name;
		this.passport = passport;
		this.email = email;
		this.contact = contact;
		this.transactionId = transactionId;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightCode() {
		return flightCode;
	}
	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}
	public String getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	public String getFlightTime() {
		return flightTime;
	}
	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(String totalFare) {
		this.totalFare = totalFare;
	}

	public String getSeatName() {
		return seatName;
	}

	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	

}
