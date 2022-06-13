package com.author.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.DataBase.AuthorDao;
import com.author.domain.Author;
@Service
public class AuthorServiceImpl implements AuthorService {
	@Autowired
	AuthorDao author;
	
	
	@Override
	public boolean addAuthor(Author person) {
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
	public List<Author> getallAuthorDetails() {
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
	public Author remove(int authorid) {
		// TODO Auto-generated method stub
		try {
			author.deleteValues(authorid);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Author updateAuthorDetails(Author person) {
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
	public List<Author> createTable() {
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
	public Author findAuthorbyId(int authorId,String authorName,String bornLocation,String bookTheme) {
		// TODO Auto-generated method stub
		try {
			return author.authorId(authorId,authorName,bornLocation,bookTheme);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Author findAuthorId(int authorId) {
		// TODO Auto-generated method stub
		try {
			return author.authorById(authorId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Author findAuthorbyBornLocation(String bornLocation) {
		// TODO Auto-generated method stub
		try {
			return author.bornLocation(bornLocation);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Author findAuthorbyBookTheme(String bookTheme) {
		// TODO Auto-generated method stub
		try {
			return author.bookTheme(bookTheme);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	

	
}
