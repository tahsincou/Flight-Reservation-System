package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.model.Airport;
import com.crud.service.AirportService;

@Controller
public class AirportController {

	@Autowired
	private AirportService airportservice;

	@GetMapping(value = "/addAirports")
	public String addAirports(Model model) {
		Airport airport = new Airport();
		model.addAttribute("airport", airport);
		return "/airport/addAirports";
	}

	@PostMapping(value = "/saveAirport")
	public String saveAirport(@ModelAttribute("airport") Airport airport) {
		airportservice.saveAirport(airport);
		return "redirect:showAirports";
	}

	@GetMapping(value = "/showAirports")
	public String showAirports(Model model) {
		model.addAttribute("listAirports", airportservice.getAllAirports());
		return "/airport/showAirports";
	}

	@GetMapping("/showAirportUpdate/{id}")
	public String showAirportUpdate(@PathVariable(value = "id") long id, Model model) {
		Airport airport = airportservice.getAirportById(id);
		model.addAttribute("airport", airport);
		return "/airport/updateAirport";

	}

	@GetMapping("/deleteAirport/{id}")
	public String deleteAirport(@PathVariable(value = "id") long id) {
		airportservice.deleteAirportById(id);
		return "redirect:/showAirports";

	}

}
