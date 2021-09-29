package com.crud.service;

import java.util.List;

import com.crud.model.Cancel;

public interface CancelService {
	
	List<Cancel> getAllCancels();
	
	void saveCancel(Cancel cancel);
	
	void deleteCancelById(Long Id);
}
