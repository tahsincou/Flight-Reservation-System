package com.crud.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Employee;
import com.crud.repository.EmployeeRepository;
import com.crud.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);

	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;

		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException("Employee not found for id::" + id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeByID(long id) {
		this.employeeRepository.deleteById(id);
		
	}
	
	public Employee emlogin(String email, int age) {
		Employee employee = employeeRepository.findByEmailAndAge(email, age);
		return employee;
	}

}
