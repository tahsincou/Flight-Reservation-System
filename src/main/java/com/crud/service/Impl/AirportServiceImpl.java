package com.crud.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Airport;
import com.crud.repository.AirportRepository;
import com.crud.service.AirportService;

@Service
public class AirportServiceImpl implements AirportService {

	@Autowired
	private AirportRepository airportRepository;
	
	@Override
	public void saveAirport(Airport airport) {
		this.airportRepository.save(airport);
	}

	@Override
	public Airport getAirportById(long id) {
		Optional<Airport> optional = airportRepository.findById(id);
		Airport airport = null;

		if (optional.isPresent()) {
			airport = optional.get();
		} else {
			throw new RuntimeException("Airport not found for id::" + id);
		}
		return airport;
	}

	@Override
	public void deleteAirportById(long id) {
		this.airportRepository.deleteById(id);
	}

	@Override
	public List<Airport> getAllAirports() {
		return airportRepository.findAll();
	}

}
