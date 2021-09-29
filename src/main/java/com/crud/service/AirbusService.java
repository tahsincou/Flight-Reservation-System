package com.crud.service;

import java.util.List;

import com.crud.model.Airbus;

public interface AirbusService {
	
	List<Airbus> getAllAirbus();
	
	void saveAirbus(Airbus airbus);
	
	Airbus getAirbusById(long id);
	
	void deleteAirbusById (long id);

	Airbus findByAirBusCode(String code);
}
