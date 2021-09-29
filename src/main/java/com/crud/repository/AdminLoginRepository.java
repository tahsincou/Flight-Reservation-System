package com.crud.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.AdminLogin;

@Repository
public interface AdminLoginRepository extends JpaRepository<AdminLogin, Integer>{
	
	AdminLogin findByNameAndPassword(String name, String password);
}
