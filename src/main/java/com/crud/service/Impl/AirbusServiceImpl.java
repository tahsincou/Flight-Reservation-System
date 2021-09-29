package com.crud.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Airbus;
import com.crud.repository.AirbusRepository;
import com.crud.service.AirbusService;

@Service
public class AirbusServiceImpl implements AirbusService {

	@Autowired
	private AirbusRepository airbusrepository;

	@Override
	public void saveAirbus(Airbus airbus) {
		this.airbusrepository.save(airbus);
	}

	@Override
	public List<Airbus> getAllAirbus() {
		return airbusrepository.findAll();
	}

	@Override
	public Airbus getAirbusById(long id) {
		Optional<Airbus> optional = airbusrepository.findById(id);
		Airbus airbus = null;

		if (optional.isPresent()) {
			airbus = optional.get();
		} else {
			throw new RuntimeException("Airbus not found for id::" + id);
		}
		return airbus;
	}

	@Override
	public void deleteAirbusById(long id) {
		this.airbusrepository.deleteById(id);

	}

	@Override
	public Airbus findByAirBusCode(String code) {
		return airbusrepository.findByAirBusCode(code);
	}

}
