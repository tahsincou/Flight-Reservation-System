package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Airbus;

@Repository
public interface AirbusRepository extends JpaRepository<Airbus, Long> {

	Airbus findByAirBusCode(String code);

}
