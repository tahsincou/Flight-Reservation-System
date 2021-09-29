package com.crud.service;

import java.util.List;

import com.crud.model.AssignFlight;


public interface AssignFlightService {
	List<AssignFlight> getAllFlights();

	void saveFlight(AssignFlight assignFlight );
	
	AssignFlight getFlightById(long id);
	
	void deleteFlightById(long id);
	
	AssignFlight getFlightByCode(String code);
}
