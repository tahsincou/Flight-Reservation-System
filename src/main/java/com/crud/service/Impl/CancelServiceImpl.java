package com.crud.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Cancel;
import com.crud.repository.CancelRepository;
import com.crud.service.CancelService;

@Service
public class CancelServiceImpl implements CancelService {

	@Autowired
	private CancelRepository cancelrepo;

	@Override
	public void saveCancel(Cancel cancel) {
		this.cancelrepo.save(cancel);
	}

	@Override
	public List<Cancel> getAllCancels() {
		return cancelrepo.findAll();
	}

	@Override
	public void deleteCancelById(Long Id) {
		this.cancelrepo.deleteById(Id);		
	}

}
