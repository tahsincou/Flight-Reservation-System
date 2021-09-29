package com.crud.controller;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crud.model.Airbus;
import com.crud.model.Airport;
import com.crud.model.AssignFlight;
import com.crud.service.AirbusService;
import com.crud.service.AirportService;
import com.crud.service.AssignFlightService;

@Controller
public class AssignFlightController {
	
	@Autowired
	private AssignFlightService assignflightservice;
	
	@Autowired
	private AirbusService airbusservice;
	
	@Autowired
	private AirportService airportservice;

	@GetMapping(value = "/assignflight")
	public String assignFlight(Model model) {
		List<Airbus> listFlight = airbusservice.getAllAirbus();
		model.addAttribute("listFlight", listFlight);
		List<Airport> listPort = airportservice.getAllAirports();
		model.addAttribute("listPort", listPort);
		AssignFlight assignFlight = new AssignFlight();
		model.addAttribute("assignflight", assignFlight);
		return "/assign/assignflight";
	}
	
	@PostMapping("/searchAssignFlight/{code}")
	@ResponseBody
	public Airbus searchAssignFlight(@PathVariable("code") String code) {
		Airbus ab = airbusservice.findByAirBusCode(code);
		System.out.println(ab.getAirBusCode() + " " + ab.getAirBusName());
		return ab;
	}
	
	///deleteFlight
	
	@PostMapping(value = "/saveFlight")
	public String saveFlight(@ModelAttribute("assignflight") AssignFlight assignflight) {
		this.assignflightservice.saveFlight(assignflight);
		return "redirect:showflight";
	}
	
	@GetMapping(value = "/showflight")
	public String showAirbus(Model model) {
		model.addAttribute("listflight", assignflightservice.getAllFlights());
		return "/assign/showflight";
	}
	
	@GetMapping("/deleteFlight/{id}")
	public String deleteFlight(@PathVariable(value = "id") long id) {
		this.assignflightservice.deleteFlightById(id);
		return "redirect:/showflight";
	}
	
	@GetMapping("/showFlightUpdate/{id}")
	public String showFlightUpdate(@PathVariable(value = "id") long id, Model model) {
		List<Airbus> listFlight = airbusservice.getAllAirbus();
		model.addAttribute("listFlight", listFlight);
		List<Airport> listPort = airportservice.getAllAirports();
		model.addAttribute("listPort", listPort);
		AssignFlight assignflight =  assignflightservice.getFlightById(id);
		model.addAttribute("assignflight", assignflight);
		return "/assign/updateflight";
	}
	
	
	
	@GetMapping("/flightChart")
	public String getAllEmployee(Model model) {	
		
	List<Date> date= assignflightservice.getAllFlights().stream().map(x->x.getFlightDate()).collect(Collectors.toList());
	List<Integer> total = assignflightservice.getAllFlights().stream().map(x-> x.getTotal()).collect(Collectors.toList());
	model.addAttribute("date", date);
	model.addAttribute("total", total);
	return "assign/flightchart";
	
	}
	/*
	 * @GetMapping("/showFlightSeat/{code}") public String
	 * showFlightSeatRequest(@PathVariable(value = "code") String code, Model model)
	 * { AssignFlight assign = assignflightservice.getFlightByCode(code);
	 * model.addAttribute("assign", assign);
	 * System.out.println(assign.getAirbusCode()); return "/booking/seatConfirm"; }
	 */
}
