package com.author.services;

import java.util.List;

import com.author.domain.Author;



public interface AuthorService{
	
	public boolean addAuthor(Author person);
	public List<Author> getallAuthorDetails();
	public Author  remove(int authorId);
	public Author updateAuthorDetails(Author person);
	public List<Author> createTable();
	public Author findAuthorbyId(int authorId);
	public Author findAuthorId(int authorId);
	public Author findAuthorbyBornLocation(String bornLocation);
	public Author findAuthorbyBookTheme(String bookTheme);
	
}