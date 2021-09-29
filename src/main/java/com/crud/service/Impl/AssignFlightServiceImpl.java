 package com.crud.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.AssignFlight;

import com.crud.repository.AssignFlightRepository;

import com.crud.service.AssignFlightService;

@Service
public class AssignFlightServiceImpl implements AssignFlightService {

	@Autowired
	private AssignFlightRepository assignFlightRepo;

	@Override
	public List<AssignFlight> getAllFlights() {
		return assignFlightRepo.findAll();
	}

	@Override
	public void saveFlight(AssignFlight assignFlight) {
		this.assignFlightRepo.save(assignFlight);

	}

	@Override
	public AssignFlight getFlightById(long id) {
		Optional<AssignFlight> optional = assignFlightRepo.findById(id);
		AssignFlight assignFlight = null;

		if (optional.isPresent()) {
			assignFlight = optional.get();
		} else {
			throw new RuntimeException("Flight not found for id::" + id);
		}
		return assignFlight;
	}

	@Override
	public void deleteFlightById(long id) {
		this.assignFlightRepo.deleteById(id);;

	}

	@Override
	public AssignFlight getFlightByCode(String code) {
		Optional<AssignFlight> optional = assignFlightRepo.findByFlightCode(code);
		AssignFlight assignFlight = null;

		if (optional.isPresent()) {
			assignFlight = optional.get();
		} else {
			throw new RuntimeException("Flight not found for id::" + code);
		}
		return assignFlight;
	}

}
