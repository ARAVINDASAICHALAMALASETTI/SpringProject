package com.author.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class NavigationController {

	@GetMapping("/Logout")
	public String logoutPage() {
		return "loginform";

	}

	@GetMapping("/Menu")
	public String returnMenu() {
		return "home";

	}
}
