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
import com.author.services.AuthorService;

@RestController
public class AuthorRestController {

	@Autowired
	AuthorService author;

	Logger logger = Logger.getLogger(AuthorRestController.class.getName());

	@PostMapping(value = "rest/addAuthor")
	public List<Author> addAuthor(@RequestBody Author person) {

		author.addAuthor(person);
		logger.info("add author data");
		return author.getallAuthorDetails();

	}

	@GetMapping(value = "rest/GetAuthorServlet", produces = "application/json")
	public List<Author> getAllAuthors() {

		List<Author> authorList = author.getallAuthorDetails();
		logger.info("get all authors data");
		return authorList;

	}

	@GetMapping("rest/GetAuthor/{authorId}")
	public Author getAuthorId(@PathVariable Integer authorId) {

		Author authorList = author.findAuthorbyId(authorId);
		logger.info("get author by id");
		return authorList;

	}

	@PutMapping("rest/updateAuthor")
	public List<Author> updateAuthor(@RequestBody Author person) {

		author.updateAuthorDetails(person);
		logger.info("update author details");
		return author.getallAuthorDetails();

	}

	@DeleteMapping("rest/deleteId/{authorId}")
	public List<Author> deleteAuthor(@PathVariable Integer authorId) {

		author.remove(authorId);
		logger.info("remove author data");
		return author.getallAuthorDetails();

	}
}
