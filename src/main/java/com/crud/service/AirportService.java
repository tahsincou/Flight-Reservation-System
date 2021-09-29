package com.crud.service;

import java.util.List;

import com.crud.model.Airport;


public interface AirportService {
	List<Airport> getAllAirports();

	void saveAirport(Airport airport);
	
	Airport getAirportById(long id);
	
	void deleteAirportById(long id);
}
