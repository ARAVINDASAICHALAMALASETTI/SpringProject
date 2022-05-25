package com.author.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
//@RequestMapping("/author/")
public class LoginController {
	@GetMapping("/login")
	private String index() {
		return "loginform";
	}

	@PostMapping("/Login")
	private String menu(ModelMap model, String username, String password, HttpSession session) {

		if (username.equals("arvindsai123@gmail.com") && password.equals("asdf1234")) {
			model.addAttribute("username", username);
			return "home";
		} else {
			model.put("loginError", "Invalid username and password");
			return "loginform";
		}

	}

}
