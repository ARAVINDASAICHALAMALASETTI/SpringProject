package com.author.services;

import java.util.List;

import com.author.domain.AuthorBookDetailsDomain;

public interface AuthorDetailsService {

	public List<AuthorBookDetailsDomain> getallBookDetails();
	public boolean addBook(AuthorBookDetailsDomain person);
	//public AuthorBookDetailsDomain  remove(int authorId);
	public String  remove(int authorId);
	public List<AuthorBookDetailsDomain> createTable();
	public AuthorBookDetailsDomain updateBookDetails(AuthorBookDetailsDomain person);
	public List<AuthorBookDetailsDomain> findAuthorbyId(int authorId);
	public AuthorBookDetailsDomain findBookId(int authorId);
}
