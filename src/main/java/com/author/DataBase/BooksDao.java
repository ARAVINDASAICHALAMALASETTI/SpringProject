package com.author.DataBase;


import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.author.domain.AuthorBooks;
@Component
public class BooksDao {
	
	Logger logger = Logger.getLogger(BooksDao.class.getName());
	@Autowired
	JdbcTemplate jdbc;
	
	
	public void createTable() throws Exception{
			
			jdbc.execute("create table booksData(Author_Id int , Book_name  varchar(30), Book_Pages_count int, Book_Publish_Date date,Joint_Authorship  varchar(255),Book_Language varchar(35),Book_Price varchar(6),Publishment varchar(25),Book_Id int PRIMARY KEY AUTO_INCREMENT,FOREIGN KEY(Author_Id) REFERENCES  authortable(Author_Id))");
				
			System.out.println("book information table created");
		
	}
	
	
	public AuthorBooks insertValues(AuthorBooks person) throws Exception{
	
			String query = "insert into booksData (Author_Id, Book_name, Book_Pages_count,Book_Publish_Date,Joint_Authorship,Book_Language,Book_Price,Publishment) Values(?,?,?,?,?,?,?,?)";
			jdbc.update(query, person.getAuthorId(), person.getBookName(), person.getBookPagesCount(), person.getBookPublishDate(), person.getJointAuthorship(), person.getBookLanguage(), person.getBookPrice(), person.getPublishment());
			logger.info("inserted id" + person.getAuthorId());
			return person;
	
   }
   
	
	public AuthorBooks updateValues(AuthorBooks person) throws SQLException {
		
			String SQL = "update booksData set Book_name=?,Book_Pages_count=?,Book_Publish_Date=?,Joint_Authorship=?,Book_Language=?,Book_Price=?,Publishment=? where Book_Id=?";
			jdbc.update(SQL,person.getBookName(),person.getBookPagesCount(),person.getBookPublishDate(),person.getJointAuthorship(),person.getBookLanguage(),person.getBookPrice(),person.getPublishment(),person.getBookId());
			return person;
				
   } 
	
	
	public List <AuthorBooks>authorDetailsList() throws SQLException{
		
			String SQL = "select * from booksData";
			List <AuthorBooks> person = jdbc.query(SQL, new BookMapper());
			return person;
		
   }
	
	public void deleteValues(int bookId) throws SQLException{
		
		String query = "delete from booksData where Book_Id = ?";
		jdbc.update(query,bookId);
		System.out.println("delete Book record from booksData table");
	
   }
	
	
	public List<AuthorBooks> authorId(int authorId) throws SQLException{
		
			String SQL = "select * from booksData where Author_Id= ?";
			List <AuthorBooks> person = jdbc.query(SQL, new BookMapper(),authorId);
			return person;
	}
   
	
	
	public AuthorBooks findBookId(int bookId) throws SQLException {
		
			String SQL = "select * from booksData where Book_Id=?";
			AuthorBooks person = jdbc.queryForObject(SQL, new BookMapper(),bookId );
			return person;
		
   }
}


