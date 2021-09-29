package com.crud.controller;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.model.AdminLogin;
import com.crud.model.Employee;
import com.crud.service.EmployeeService;
import com.crud.service.Impl.AdminLoginService;
import com.crud.service.Impl.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	private Employee x;

//	display list of employees
	@GetMapping(value = "/employee")
	public String viewHomPage(Model model) {
		model.addAttribute("listEmployees", employeeService.getAllEmployees());
		return "employee/employee";
	}

	@GetMapping(value = "/add")
	public String add(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "/employee/add";
	}

	@PostMapping(value = "/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employee";
	}

	@GetMapping("/showFormUpdate/{id}")
	public String showFormUpdate(@PathVariable(value = "id") long id, Model model) {

		Employee employee = employeeService.getEmployeeById(id);

		model.addAttribute("employee", employee);
		return "/employee/update";

	}

	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value = "id") long id) { 
		this.employeeService.deleteEmployeeByID(id);
		return "redirect:/employee";

	}
	
	@GetMapping("/barChart")
	public String getAllEmployee(Model model) {	
		
	List<String> nameList= employeeService.getAllEmployees().stream().map(x->x.getName()).collect(Collectors.toList());
	List<Integer> age = employeeService.getAllEmployees().stream().map(x-> x.getAge()).collect(Collectors.toList());
	model.addAttribute("name", nameList);
	model.addAttribute("age", age);
	return "employee/demo";
	
	}
	
	@Autowired
	private EmployeeServiceImpl empserv;
	
	@GetMapping(value="/emplogin")
	public String EmployeeLogin(Model model) {
		Employee employee =new Employee();
		model.addAttribute("employee",employee);
		return "employee/login";
	}
	
	@PostMapping(value="/emploginsuccess")
	public String emplogin(@ModelAttribute("employee") Employee employee, Model model) {

		Employee adLog = empserv.emlogin(employee.getEmail(), employee.getAge());

		if (Objects.nonNull(adLog)) {
			/* model.addAttribute("name",admin.getName()); */
			return "redirect:/employee";
		}
		{
			return "redirect:/emplogin";
		}

	}
	
	
}