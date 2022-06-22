package com.author.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.author.domain.Author;
import com.author.services.AuthorService;
import com.author.validation.AuthorValidations;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
@RequestMapping("/author/")

public class AuthorController {

	@Autowired
	AuthorService author;
	
	

	//Logger logger = Logger.getLogger(AuthorController.class.getName());
	
	@GetMapping("Add")
	public String addAuthor( ModelMap model,HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
			return "index";
		}
		return "addAuthor";

	}

	@PostMapping("Add")
	public String addAuthor(@ModelAttribute Author person, ModelMap model,HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
			return "index";
		}
		// add bean validation
		String error = AuthorValidations.validate(person);
		if (StringUtils.hasLength(error)) {
			model.addAttribute("author", person);
			model.addAttribute("emptyFliedError", error);
			return "addAuthor";
		}
		author.addAuthor(person);
		log.info("add author data");
		/*List<Author> authorList = author.getallAuthorDetails();
		log.info("get authors data");
		model.addAttribute("authorList", authorList);
		return "GetData";*/
		return "redirect:/author/FetchData";

	}
	@GetMapping("/FetchData")
	public String FetchData() {
		return "domain";
	}

	@GetMapping("/GetAuthorServlet")
	public String getAuthor(ModelMap model,HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
			return "index";
		}
		List<Author> authorList = author.getallAuthorDetails();
		log.info("get authors data");
		model.addAttribute("authorList", authorList);
		return "GetData";

	}

	@GetMapping("/Edit/{authorId}")
	public String editAuthor(@PathVariable("authorId") Integer authorId, Model model,HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
			return "index";
		}
		Author authorDetails = author.findAuthorId(authorId);
		model.addAttribute("author", authorDetails);
		return "editAuthorData";

	}

	@PostMapping("Edit")
	public String editAuthor1(@ModelAttribute Author person, ModelMap model, HttpSession session) {
		
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
			return "index";
		}

		// edit bean validation
		
		String error = AuthorValidations.validate(person);
		if (StringUtils.hasLength(error)) {
			model.addAttribute("author", person);
			model.addAttribute("emptyFliedError", error);
			return "editAuthorData";
		}
		author.updateAuthorDetails(person);
		List<Author> authorList = author.getallAuthorDetails();
		log.info("get authors data");
		model.addAttribute("authorList", authorList);
		return "GetData";

	}

	@GetMapping("/Delete")
	public String deleteAuthor(Integer authorId, ModelMap model,HttpSession session) {
		String username = (String) session.getAttribute("username");
		if (username == null) {
			model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
			return "index";
		}
		author.remove(authorId);
		log.info("remove author data");
		List<Author> authorList = author.getallAuthorDetails();
		log.info("get all author's data");
		model.addAttribute("authorList", authorList);
		return "GetData";

	}
	
	@GetMapping("/searchAuthor")
	public String searchAuthorRecord(String authorId, Model uiModel, HttpSession session) {
		String username = (String) session.getAttribute("username");
		Author authors = null;

		if (username == null) {
			uiModel.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
			return "index";
		}
		
			if(authorId.isEmpty()) {
				uiModel.addAttribute("inValidauthorId", "Please enter valid author Id");
				List<Author> authorList =  author.getallAuthorDetails();
				uiModel.addAttribute("authorList", authorList);
				return "GetData";
				
			}
			authors = author.findAuthorbyId(Integer.parseInt(authorId));
			uiModel.addAttribute("searchAuthor", authors);
			return "searchAuthorById";
		
	}


	

}
