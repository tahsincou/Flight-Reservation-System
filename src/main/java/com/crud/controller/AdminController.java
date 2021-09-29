package com.crud.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.model.AdminLogin;
import com.crud.model.AssignFlight;
import com.crud.service.AssignFlightService;
import com.crud.service.BookingService;
import com.crud.service.Impl.AdminLoginService;

@Controller
public class AdminController {

	@Autowired
	private AssignFlightService assignflightservice;

	@Autowired
	private BookingService bookingservice;
	
	@GetMapping(value = "/dashboard")
	public String dashboard(Model model, @ModelAttribute("admin") AdminLogin admin) {

		List<AssignFlight> flight = assignflightservice.getAllFlights();
		model.addAttribute("flight", flight);
		 model.addAttribute("name",admin.getName());
		model.addAttribute("listbookings", bookingservice.getAllBookings());
		return "index";
	}

	@Autowired
	private AdminLoginService adminlogserv;

	@GetMapping(value = "/")
	public String login(Model model) {

		AdminLogin adminlogin = new AdminLogin();
		model.addAttribute("admin", adminlogin);
		return "adminLogin";
	}

	@PostMapping(value = "/login")
	public String login(@ModelAttribute("admin") AdminLogin admin, Model model) {

		AdminLogin adLog = adminlogserv.login(admin.getName(), admin.getPassword());

		if (Objects.nonNull(adLog)) {
			/* model.addAttribute("name",admin.getName()); */
			return "redirect:/dashboard";
		}
		{
			return "redirect:/adminLogin";
		}

	}
	
	

}
