package com.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airbus")
public class Airbus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;


	@Column
	private String airBusName;

	@Column
	private String airBusCode;

	@Column
	private int economy_seat;
	
	@Column
	private int business_seat;
	
	@Column
	private int premium_seat;

	public Airbus() {
		
	}

	public Airbus(long id, String airBusName, String airBusCode, int economy_seat, int business_seat,
			int premium_seat) {
		super();
		this.id = id;
		this.airBusName = airBusName;
		this.airBusCode = airBusCode;
		this.economy_seat = economy_seat;
		this.business_seat = business_seat;
		this.premium_seat = premium_seat;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAirBusName() {
		return airBusName;
	}

	public void setAirBusName(String airBusName) {
		this.airBusName = airBusName;
	}

	public String getAirBusCode() {
		return airBusCode;
	}

	public void setAirBusCode(String airBusCode) {
		this.airBusCode = airBusCode;
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
	
	
}
