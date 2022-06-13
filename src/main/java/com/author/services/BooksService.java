package com.author.services;

import java.util.List;

import com.author.domain.AuthorBooks;

public interface BooksService {

	public List<AuthorBooks> getallBookDetails();
	public boolean addBook(AuthorBooks person);
	public String  remove(int authorId);
	public List<AuthorBooks> createTable();
	public AuthorBooks updateBookDetails(AuthorBooks person);
	public List<AuthorBooks> findAuthorbyId(int authorId);
	public AuthorBooks findBookId(int authorId);
}
