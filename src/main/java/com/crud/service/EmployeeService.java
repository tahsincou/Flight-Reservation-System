package com.crud.service;

import java.util.List;
import com.crud.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();

	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeByID(long id);
}
