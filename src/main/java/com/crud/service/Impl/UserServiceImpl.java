package com.crud.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.User;
import com.crud.repository.UserRepository;

@Service
public class UserServiceImpl {

	@Autowired
	private UserRepository userrepo;
	
	public List<User> getAllActiveImages() {
		return userrepo.findAll();
	}

	public Optional<User> getImageById(Long id) {
		return userrepo.findById(id);
	}
}
