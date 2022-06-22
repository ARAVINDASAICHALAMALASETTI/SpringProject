package com.author.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.author.domain.Author;
import com.author.exception.AuthorIdNotFoundException;
import com.author.services.AuthorService;
import com.author.validation.AuthorValidations;

@RestController
public class AuthorRestController {

	@Autowired
	AuthorService author;

	Logger logger = Logger.getLogger(AuthorRestController.class.getName());

	@PostMapping(value = "rest/addAuthor")
	public Author addAuthor(@RequestBody Author person) throws AuthorIdNotFoundException {
		String error = AuthorValidations.validate(person);
		if (error != null && error.trim().length() > 0) {
			throw new AuthorIdNotFoundException(error);
		}
		 author.addAuthor(person);
		logger.info("add author data");
		return person;

	}

	@GetMapping(value = "rest/GetAuthorServlet", produces = "application/json")
	public List<Author> getAllAuthors() {

		List<Author> authorList = author.getallAuthorDetails();
		logger.info("get all authors data");
		return authorList;

	}

	@GetMapping("rest/GetAuthor/{authorId}")
	public Author getAuthorId(@PathVariable Integer authorId) {

		Author authorList = author.findAuthorId(authorId);
		logger.info("get author by id");
		return authorList;

	}
	
	@GetMapping("rest/GetSearchData/{authorName}")
	public Author getSearchData(@PathVariable Integer authorId) {

		Author authorList = author.findAuthorbyId(authorId);
		logger.info("get author by id");
		return authorList;

	}

	@PutMapping("rest/updateAuthor")
	public Author updateAuthor(@RequestBody Author person) throws AuthorIdNotFoundException {
		String error = AuthorValidations.validate(person);
		if (error != null && error.trim().length() > 0) {
			throw new AuthorIdNotFoundException(error);
		}
		author.updateAuthorDetails(person);
		logger.info("update author details");
		return person;

	}

	@DeleteMapping("rest/deleteId/{authorId}")
	public List<Author> deleteAuthor(@PathVariable Integer authorId) {

		author.remove(authorId);
		logger.info("remove author data");
		return author.getallAuthorDetails();

	}
}
