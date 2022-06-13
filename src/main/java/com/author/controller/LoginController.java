package com.author.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.author.domain.Author;
import com.author.domain.AuthorBooks;
import com.author.domain.RegisterForm;
import com.author.services.RegistrationService;
import com.author.validation.AuthorValidations;

@Controller
@RequestMapping("/author/")
public class LoginController {
	
	@Autowired
	RegistrationService register;
	
	Logger logger = Logger.getLogger(LoginController.class.getName());
	
	@GetMapping("/")
	private String index(Model model,HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
			return "index";
		}
		return "index";
	}

	@PostMapping("/Login")
	private String menu(ModelMap model, String username, String password, HttpSession session) {
		 RegisterForm registerList = register.getRegisterFormDetailsList(username);
		if (registerList.getEmail().equals(username) && registerList.getPassword().equals(password)) {
			session.setAttribute("username", registerList.getUserName());
			model.addAttribute("username", registerList.getUserName());
			return "home";
		} else {
			model.put("loginError", "Invalid username and password");
			
			return "index";
		}

	}
	
	@GetMapping("/addRegister")
	public String addRegisterUser(String registerId,Model model,HttpSession session){
		/*String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
			return "index";
		}*/
		model.addAttribute("registerId", registerId);
		model.addAttribute("registerForm", new RegisterForm());
		return "registerform";

	}
	
	@PostMapping("/addRegister")
	public  String addRegisterUser(@Valid @ModelAttribute("registerForm") RegisterForm person,BindingResult result,ModelMap model,HttpSession session) {
		
		if(result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError error : allErrors) {
				logger.info("error"+ error);
			}
			return "registerform";
		}
			register.insertRegisterFormValues(person);
			logger.info("add register user data");
			return "index";
		
	}
	
	@GetMapping("/GetAllRegisterUsers")
	public String getallRegisterUsers(ModelMap model,HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
			return "index";
		}
		List <RegisterForm> registerList = register.getAllRegisterFormDetailsList();
		logger.info("get all register users list");
		model.addAttribute("registerList",registerList);
		return "GetRegisterData";
		
	}
	

}
