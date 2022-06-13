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

import com.author.domain.AuthorBooks;
import com.author.services.BooksService;

@RestController
public class BookRestController {

	@Autowired
	BooksService book;
	
	Logger logger = Logger.getLogger(BookRestController.class.getName());

	@PostMapping(value = "rest/addBook")
	public AuthorBooks addAuthor(@RequestBody AuthorBooks person) {
		
		book.addBook(person);
		logger.info("add book data");
		return person;

	}

	@GetMapping(value = "rest/GetAllBooks", produces = "application/json")
	public List<AuthorBooks> getAllBooks() {

		List<AuthorBooks> authorList = book.getallBookDetails();
		logger.info("get all books data");
		return authorList;

	}

	@GetMapping("rest/GetBook/{bookId}")
	public AuthorBooks getAuthorId(@PathVariable Integer bookId) {

		AuthorBooks authorList = book.findBookId(bookId);
		logger.info("get book by id");
		return authorList;

	}

	@PutMapping("rest/updateBook")
	public AuthorBooks updateBook(@RequestBody AuthorBooks person) {

		book.updateBookDetails(person);
		logger.info("update book details");
		return person;

	}
	
	@GetMapping("rest/FindAuthorById/{authorId}")
	public List<AuthorBooks> getAuthorBook(@PathVariable Integer authorId) {

		List<AuthorBooks> authorList = book.findAuthorbyId(authorId);
		logger.info("get books data");
		return authorList;

	}

	@DeleteMapping("rest/deleteBook/{bookId}")
	public List<AuthorBooks> deleteBook(@PathVariable Integer bookId) {

		book.remove(bookId);
		logger.info("remove book data");
		return book.getallBookDetails();

	}
}
