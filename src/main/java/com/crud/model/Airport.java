package com.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airport")
public class Airport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String airName;

	@Column
	private String airCode;

	@Column
	private String airCity;

	@Column
	private String airCountry;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAirName() {
		return airName;
	}

	public void setAirName(String airName) {
		this.airName = airName;
	}

	public String getAirCode() {
		return airCode;
	}

	public void setAirCode(String airCode) {
		this.airCode = airCode;
	}

	public String getAirCity() {
		return airCity;
	}

	public void setAirCity(String airCity) {
		this.airCity = airCity;
	}

	public String getAirCountry() {
		return airCountry;
	}

	public void setAirCountry(String airCountry) {
		this.airCountry = airCountry;
	}

	public Airport(long id, String airName, String airCode, String airCity, String airCountry) {
		super();
		this.id = id;
		this.airName = airName;
		this.airCode = airCode;
		this.airCity = airCity;
		this.airCountry = airCountry;
	}

	public Airport() {

	}

}
