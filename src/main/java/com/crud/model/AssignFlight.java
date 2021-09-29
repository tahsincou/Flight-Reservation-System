package com.crud.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assignFlight")
public class AssignFlight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String flightName;
	@Column
	private String flightCode;

	@Column
	private Date flightDate;
	@Column
	private String takeoffTime;
	@Column
	private String start;
	@Column
	private String destination;
	@Column
	private String airbusCode;
	
	@Column
	private int economy_seat;
	
	@Column
	private int business_seat;
	
	@Column
	private int premium_seat;
	
	@Column
	private Double fareEconomy;
	@Column
	private Double fareBusiness;
	@Column
	private Double farePremium;

	@Column
	private int total;
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, P1, P2, P3, P4, P5, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10,
			E11, E12, E13, E14, E15;



	public AssignFlight(long id, String flightName, String flightCode, Date flightDate, String takeoffTime,
			String start, String destination, String airbusCode, int economy_seat, int business_seat, int premium_seat,
			Double fareEconomy, Double fareBusiness, Double farePremium, int total, String b1, String b2, String b3,
			String b4, String b5, String b6, String b7, String b8, String b9, String b10, String p1, String p2,
			String p3, String p4, String p5, String e1, String e2, String e3, String e4, String e5, String e6,
			String e7, String e8, String e9, String e10, String e11, String e12, String e13, String e14, String e15) {
		super();
		this.id = id;
		this.flightName = flightName;
		this.flightCode = flightCode;
		this.flightDate = flightDate;
		this.takeoffTime = takeoffTime;
		this.start = start;
		this.destination = destination;
		this.airbusCode = airbusCode;
		this.economy_seat = economy_seat;
		this.business_seat = business_seat;
		this.premium_seat = premium_seat;
		this.fareEconomy = fareEconomy;
		this.fareBusiness = fareBusiness;
		this.farePremium = farePremium;
		this.total = total;
		B1 = b1;
		B2 = b2;
		B3 = b3;
		B4 = b4;
		B5 = b5;
		B6 = b6;
		B7 = b7;
		B8 = b8;
		B9 = b9;
		B10 = b10;
		P1 = p1;
		P2 = p2;
		P3 = p3;
		P4 = p4;
		P5 = p5;
		E1 = e1;
		E2 = e2;
		E3 = e3;
		E4 = e4;
		E5 = e5;
		E6 = e6;
		E7 = e7;
		E8 = e8;
		E9 = e9;
		E10 = e10;
		E11 = e11;
		E12 = e12;
		E13 = e13;
		E14 = e14;
		E15 = e15;
	}

	public AssignFlight() {

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

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public String getTakeoffTime() {
		return takeoffTime;
	}

	public void setTakeoffTime(String takeoffTime) {
		this.takeoffTime = takeoffTime;
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

	public String getAirbusCode() {
		return airbusCode;
	}

	public void setAirbusCode(String airbusCode) {
		this.airbusCode = airbusCode;
	}

	public Double getFareEconomy() {
		return fareEconomy;
	}

	public void setFareEconomy(Double fareEconomy) {
		this.fareEconomy = fareEconomy;
	}

	public Double getFareBusiness() {
		return fareBusiness;
	}

	public void setFareBusiness(Double fareBusiness) {
		this.fareBusiness = fareBusiness;
	}

	public Double getFarePremium() {
		return farePremium;
	}

	public void setFarePremium(Double farePremium) {
		this.farePremium = farePremium;
	}

	public int getEconomy_seat() {
		return economy_seat;
	}

	public void setEconomy_seat(int economy_seat) {
		this.economy_seat = economy_seat;
	}

	public int getBusiness_seat() {
		return business_seat;
	}

	public void setBusiness_seat(int business_seat) {
		this.business_seat = business_seat;
	}

	public int getPremium_seat() {
		return premium_seat;
	}

	public void setPremium_seat(int premium_seat) {
		this.premium_seat = premium_seat;
	}

	public String getB1() {
		return B1;
	}

	public void setB1(String b1) {
		B1 = b1;
	}

	public String getB2() {
		return B2;
	}

	public void setB2(String b2) {
		B2 = b2;
	}

	public String getB3() {
		return B3;
	}

	public void setB3(String b3) {
		B3 = b3;
	}

	public String getB4() {
		return B4;
	}

	public void setB4(String b4) {
		B4 = b4;
	}

	public String getB5() {
		return B5;
	}

	public void setB5(String b5) {
		B5 = b5;
	}

	public String getB6() {
		return B6;
	}

	public void setB6(String b6) {
		B6 = b6;
	}

	public String getB7() {
		return B7;
	}

	public void setB7(String b7) {
		B7 = b7;
	}

	public String getB8() {
		return B8;
	}

	public void setB8(String b8) {
		B8 = b8;
	}

	public String getB9() {
		return B9;
	}

	public void setB9(String b9) {
		B9 = b9;
	}

	public String getB10() {
		return B10;
	}

	public void setB10(String b10) {
		B10 = b10;
	}

	public String getP1() {
		return P1;
	}

	public void setP1(String p1) {
		P1 = p1;
	}

	public String getP2() {
		return P2;
	}

	public void setP2(String p2) {
		P2 = p2;
	}

	public String getP4() {
		return P4;
	}

	public void setP4(String p4) {
		P4 = p4;
	}

	public String getP5() {
		return P5;
	}

	public void setP5(String p5) {
		P5 = p5;
	}

	public String getE1() {
		return E1;
	}

	public void setE1(String e1) {
		E1 = e1;
	}

	public String getE2() {
		return E2;
	}

	public void setE2(String e2) {
		E2 = e2;
	}

	public String getE3() {
		return E3;
	}

	public void setE3(String e3) {
		E3 = e3;
	}

	public String getP3() {
		return P3;
	}

	public void setP3(String p3) {
		P3 = p3;
	}

	public String getE4() {
		return E4;
	}

	public void setE4(String e4) {
		E4 = e4;
	}

	public String getE5() {
		return E5;
	}

	public void setE5(String e5) {
		E5 = e5;
	}

	public String getE6() {
		return E6;
	}

	public void setE6(String e6) {
		E6 = e6;
	}

	public String getE7() {
		return E7;
	}

	public void setE7(String e7) {
		E7 = e7;
	}

	public String getE8() {
		return E8;
	}

	public void setE8(String e8) {
		E8 = e8;
	}

	public String getE9() {
		return E9;
	}

	public void setE9(String e9) {
		E9 = e9;
	}

	public String getE10() {
		return E10;
	}

	public void setE10(String e10) {
		E10 = e10;
	}

	public String getE11() {
		return E11;
	}

	public void setE11(String e11) {
		E11 = e11;
	}

	public String getE12() {
		return E12;
	}

	public void setE12(String e12) {
		E12 = e12;
	}

	public String getE13() {
		return E13;
	}

	public void setE13(String e13) {
		E13 = e13;
	}

	public String getE14() {
		return E14;
	}

	public void setE14(String e14) {
		E14 = e14;
	}

	public String getE15() {
		return E15;
	}

	public void setE15(String e15) {
		E15 = e15;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	
}
