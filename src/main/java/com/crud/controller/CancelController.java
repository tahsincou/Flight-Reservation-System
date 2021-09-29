package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.crud.service.CancelService;

@Controller
public class CancelController {

	@Autowired
	private CancelService cancelserv;

	@GetMapping(value = "/showallcencels")
	public String cancelrequest(Model model) {
		model.addAttribute("cancel", cancelserv.getAllCancels());
		return "booking/showcancel";
	}
	
	@GetMapping("/deleteCancel/{id}")
	public String deleteCancel(@PathVariable(value = "id") long id) {
		this.cancelserv.deleteCancelById(id);	
		return "redirect:/showallcencels";
	}
}
