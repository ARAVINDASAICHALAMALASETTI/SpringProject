package com.author.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.DataBase.BooksDao;
import com.author.domain.AuthorBooks;
@Service
public class BookServiceImpl implements BooksService {
	@Autowired
	 BooksDao author;

	 
	 @Override
		public List<AuthorBooks> createTable() {
			// TODO Auto-generated method stub
			try {
				author.createTable();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	 

	@Override
	public boolean addBook(AuthorBooks person) {
		// TODO Auto-generated method stub
		try {
			author.insertValues(person);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public AuthorBooks updateBookDetails(AuthorBooks person) {
		// TODO Auto-generated method stub
		try {
			return author.updateValues(person);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	@Override
	public List<AuthorBooks> getallBookDetails() {
		// TODO Auto-generated method stub
		try {
			return author.authorDetailsList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String remove(int person) {
		// TODO Auto-generated method stub
		try {
			author.deleteValues(person);
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public List<AuthorBooks> findAuthorbyId(int authorId) {
		// TODO Auto-generated method stub
		try {
			return author.authorId(authorId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public AuthorBooks findBookId(int bookId) {
		// TODO Auto-generated method stub
				try {
					return author.findBookId(bookId);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return null;
	}
}
