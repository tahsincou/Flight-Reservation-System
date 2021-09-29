package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Cancel;

@Repository
public interface CancelRepository extends JpaRepository<Cancel, Long> {

}
