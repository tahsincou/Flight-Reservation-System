package com.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.AssignFlight;

@Repository
public interface AssignFlightRepository  extends JpaRepository<AssignFlight, Long>{

	Optional<AssignFlight> findByFlightCode(String start);
}
