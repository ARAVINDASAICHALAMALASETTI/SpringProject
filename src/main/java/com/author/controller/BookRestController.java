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

import com.author.domain.AuthorBookDetailsDomain;
import com.author.services.AuthorDetailsService;

@RestController
public class BookRestController {

	@Autowired
	AuthorDetailsService book;
	
	Logger logger = Logger.getLogger(BookRestController.class.getName());

	@PostMapping(value = "rest/addBook")
	public List<AuthorBookDetailsDomain> addAuthor(@RequestBody AuthorBookDetailsDomain person) {

		book.addBook(person);
		logger.info("add book data");
		return book.getallBookDetails();

	}

	@GetMapping(value = "rest/GetAllBooks", produces = "application/json")
	public List<AuthorBookDetailsDomain> getAllBooks() {

		List<AuthorBookDetailsDomain> authorList = book.getallBookDetails();
		logger.info("get all books data");
		return authorList;

	}

	@GetMapping("rest/GetBook/{bookId}")
	public AuthorBookDetailsDomain getAuthorId(@PathVariable Integer bookId) {

		AuthorBookDetailsDomain authorList = book.findBookId(bookId);
		logger.info("get book by id");
		return authorList;

	}

	@PutMapping("rest/updateBook")
	public List<AuthorBookDetailsDomain> updateBook(@RequestBody AuthorBookDetailsDomain person) {

		book.updateBookDetails(person);
		logger.info("update book details");
		return book.getallBookDetails();

	}
	
	@GetMapping("rest/FindAuthorById/{authorId}")
	public List<AuthorBookDetailsDomain> getAuthorBook(@PathVariable Integer authorId) {

		List<AuthorBookDetailsDomain> authorList = book.findAuthorbyId(authorId);
		logger.info("get books data");
		return authorList;

	}

	@DeleteMapping("rest/deleteBook/{bookId}")
	public List<AuthorBookDetailsDomain> deleteBook(@PathVariable Integer bookId) {

		book.remove(bookId);
		logger.info("remove book data");
		return book.getallBookDetails();

	}
}
