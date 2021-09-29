
package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.model.Airbus;
import com.crud.model.Airport;
import com.crud.model.AssignFlight;
import com.crud.service.AirbusService;
import com.crud.service.AirportService;
import com.crud.service.AssignFlightService;
import com.crud.service.BookingService;

@Controller
public class BookingController {

	@Autowired
	private AirbusService airbusservice;
	
	@Autowired
	private AirportService airportservice;
	
	@Autowired
	private BookingService bookingservice;

	@Autowired
	private AssignFlightService assignservice;

	@GetMapping(value = "/showbookings")
	public String bookingwizard(Model model) {
		model.addAttribute("listbookings", bookingservice.getAllBookings());
		return "/booking/showbookings";
	}

	@GetMapping("/confirmbooking/{id}")
	public String deleteAirport(@PathVariable(value = "id") long id) {
		bookingservice.deleteBookingById(id);
		return "redirect:/showbookings";
	}
	
	@PostMapping(value = "/updateSeat")
	public String saveFlight(@ModelAttribute("assignflight") AssignFlight assignflight) {
		this.assignservice.saveFlight(assignflight);
		return "redirect:showbookings";
	}
	
	@GetMapping("/showSeat/{code}")
	public String showFlightSeatRequest(@PathVariable(value = "code") String code, Model model) {
		List<Airbus> listFlight = airbusservice.getAllAirbus();
		model.addAttribute("listFlight", listFlight);
		List<Airport> listPort = airportservice.getAllAirports();
		model.addAttribute("listPort", listPort);
		AssignFlight assign =  assignservice.getFlightByCode(code);
		model.addAttribute("assign", assign);
		model.addAttribute("fcode",code);
		model.addAttribute("plan", assign.getFlightCode());
		System.out.println(assign.getAirbusCode());
		return "/booking/updateSeat";
	}
}
