package com.crud.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crud.model.User;
import com.crud.service.Impl.UserServiceImpl;



@Controller
public class UserController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserServiceImpl userserviceimpl;
	
	@GetMapping("/user/display/{id}")
	@ResponseBody
	void showImage(@PathVariable("id") Long id, HttpServletResponse response, Optional<User> images)
			throws ServletException, IOException {
		log.info("Id :: " + id);
		images= userserviceimpl.getImageById(id);
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		response.getOutputStream().write(images.get().getImage());
		response.getOutputStream().close();
	}
	
	@GetMapping("/user/userDetails")
	String showProductDetails(@RequestParam("id") Long id, Optional<User> images, Model model) {
		try {
			log.info("Id :: " + id);
			if (id != 0) {
				images = userserviceimpl.getImageById(id);

				log.info("User :: " + images);
				if (images.isPresent()) {
					model.addAttribute("id", images.get().getId());
					model.addAttribute("name", images.get().getName());
					model.addAttribute("email", images.get().getEmail());
					model.addAttribute("mobile", images.get().getMobile());
					return "user/userProfile";
				}
				return "redirect:/user/show";
			}
			return "redirect:/user/show";
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/user/showe";
		}
	}

	
	@GetMapping("/user/show")
	String show(Model map) {
		List<User> images = userserviceimpl.getAllActiveImages();
		map.addAttribute("images", images);
		return "/user/showAllUser";
	}
	
	@GetMapping("/userProfile")
	String userProfile() {
		
		return "user/userProfile";
	}
	
	
	
	
}
