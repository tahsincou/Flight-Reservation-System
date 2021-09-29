package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.model.Airbus;
import com.crud.service.AirbusService;

@Controller
public class AirbusController {
	@Autowired
	private AirbusService airbusservice;

	@GetMapping(value = "/addAirbus")
	public String addAirports(Model model) {
		Airbus airbus = new Airbus();
		model.addAttribute("airbus", airbus);
		return "/airbus/addAirbus";
	}

	@PostMapping(value = "/saveAirbus")
	public String saveAirbus(@ModelAttribute("airbus") Airbus airbus) {
		this.airbusservice.saveAirbus(airbus);
		return "redirect:showAirbuses";
	}

	@GetMapping(value = "/showAirbuses")
	public String showAirbus(Model model) {
		model.addAttribute("listAirbus", airbusservice.getAllAirbus());
		return "/airbus/showAirbuses";
	}

	@GetMapping("/showAirbusUpdate/{id}")
	public String showAirbusUpdate(@PathVariable(value = "id") long id, Model model) {
		Airbus airbus = airbusservice.getAirbusById(id);
		model.addAttribute("airbus", airbus);
		return "/airbus/updateAirbus";
	}

	@GetMapping("/deleteAirbus/{id}")
	public String deleteAirport(@PathVariable(value = "id") long id) {

		this.airbusservice.deleteAirbusById(id);
		return "redirect:showAirbuses";

	}

}
