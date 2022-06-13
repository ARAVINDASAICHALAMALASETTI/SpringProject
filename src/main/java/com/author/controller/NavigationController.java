package com.author.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class NavigationController {

	@GetMapping("/Logout")
	public String logoutPage( ModelMap model,HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
			return "index";
		}
		return "index";

	}

	@GetMapping("/Menu")
	public String returnMenu(ModelMap model,HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
			return "index";
		}
		return "home";

	}
}
