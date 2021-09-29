package com.crud.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.AdminLogin;
import com.crud.repository.AdminLoginRepository;

@Service
public class AdminLoginService {

	@Autowired
	private AdminLoginRepository repo;

	public AdminLogin login(String name, String password) {
		AdminLogin admin = repo.findByNameAndPassword(name, password);
		return admin;
	}
}
