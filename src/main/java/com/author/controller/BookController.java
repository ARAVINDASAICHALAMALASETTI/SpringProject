package com.author.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.author.domain.AuthorBooks;
import com.author.services.BooksService;
@Controller
@RequestMapping("/book/")
public class BookController {
	
		@Autowired
		BooksService book;
		Logger logger = Logger.getLogger(BookController.class.getName());
		@GetMapping("/add")
		public String addBook(String authorId,Model model,HttpSession session){
			String username = (String) session.getAttribute("username");
			if (username == null) {
				model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
				return "index";
			}
			model.addAttribute("authorId", authorId);
			model.addAttribute("person", new AuthorBooks());
			return "addBook";

		}
		
		@PostMapping("/add")
		public  String addBook(@Valid @ModelAttribute("person") AuthorBooks person,BindingResult result,ModelMap model,HttpSession session) {
			
			String username = (String) session.getAttribute("username");
			if (username == null) {
				model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
				return "index";
			}
			if(result.hasErrors()) {
				List<ObjectError> allErrors = result.getAllErrors();
				for(ObjectError error : allErrors) {
					logger.info("error"+ error);
				}
				return "addBook";
			}
				book.addBook(person);
				logger.info("add book data");
				/*List <AuthorBooks> bookList = book.getallBookDetails();
				logger.info("add book to get all books data");
				model.addAttribute("bookList",bookList);
				return "GetBookData";*/
				return "redirect:/book/GetBookServlet";
			    
		}
		@GetMapping("/GetBookServlet")
		public String getallBook(ModelMap model,HttpSession session) {
			String username = (String) session.getAttribute("username");
			if (username == null) {
				model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
				return "index";
			}
			List <AuthorBooks> bookList = book.getallBookDetails();
			logger.info("get all books data");
			model.addAttribute("bookList",bookList);
			return "GetBookData";
			
		}
		@GetMapping("/FindAuthorById")
		public String getAuthor(ModelMap model, Integer authorId,HttpSession session) {
			String username = (String) session.getAttribute("username");
			if (username == null) {
				model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
				return "index";
			}
			List <AuthorBooks> booksList = book.findAuthorbyId(authorId);
			logger.info("get books data");
			model.addAttribute("booksList",booksList);
			return "GetAuthorId";
			
		}
		@GetMapping("/edit/{bookId}")
		public String editBook(@PathVariable("bookId") Integer bookId,Model model,HttpSession session) {
			String username = (String) session.getAttribute("username");
			if (username == null) {
				model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
				return "index";
			}
			AuthorBooks authorDetails = book.findBookId(bookId);
			model.addAttribute("book",authorDetails);
			return "editBookData";

		}
		@PostMapping("/edit")
		public String editBook(@Valid @ModelAttribute("book") AuthorBooks bookId,BindingResult result,ModelMap model,HttpSession session) {
			String username = (String) session.getAttribute("username");
			if (username == null) {
				model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
				return "index";
			}
			if(result.hasErrors()) {
				List<ObjectError> allErrors = result.getAllErrors();
				for(ObjectError error : allErrors) {
					logger.info("error"+ error);
				}
				return "editBookData";
			}
			book.updateBookDetails(bookId);
			List <AuthorBooks>bookList = book.getallBookDetails();
			logger.info("edit single book data");
			model.addAttribute("bookList",bookList);
			return "GetBookData";
			
		}
		
		
		@RequestMapping(value="/delete/{bookId}", method= {RequestMethod.GET})
		public String deleteAuthor(@PathVariable("bookId") Integer bookId,ModelMap model,HttpSession session) throws Exception {
			String username = (String) session.getAttribute("username");
			if (username == null) {
				model.addAttribute("loginError", "your session is expired. Please re-enter your credentials");
				return "index";
			}
		       book.remove(bookId);
		       logger.info("delete single from books data");
			   List <AuthorBooks> bookList = book.getallBookDetails();
			   logger.info("remove single record from get all author's data");
			   model.addAttribute("bookList",bookList);
			   return "GetBookData";  

		   }
		
		   /*@GetMapping("/delete")
			public String deleteAuthor(Integer bookId,ModelMap model) {
				book.remove(bookId);
				logger.info("remove author data");
				List <AuthorBookDetailsDomain> bookList = book.getallBookDetails();
				System.out.println("get all author's data");
				model.addAttribute("bookList",bookList);
				return "GetBookData";
				
			}*/

}


