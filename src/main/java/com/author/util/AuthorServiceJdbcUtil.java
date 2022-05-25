package com.author.util;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.author.domain.Author;

@Component
public class AuthorServiceJdbcUtil {
	
	Logger logger = Logger.getLogger(AuthorServiceJdbcUtil.class.getName());

	@Autowired
	JdbcTemplate jdbc;

	public void createTable() throws Exception {

		jdbc.execute("create table authortable(Author_Id int PRIMARY KEY AUTO_INCREMENT, Author_name  varchar(255),Gender varchar(20), Birth_year  date, Birth_place  varchar(255), Book_Theme  varchar(255), Books_published_count  int,Last_Book_Publish_Date date)");

		System.out.println("author information table created");

	}

	public Author insertValues(Author person) throws Exception {

		
		String query =	"insert into authortable(Author_name,Gender,Birth_year,Birth_place,Book_Theme,Books_published_count,Last_Book_Publish_Date)Values(?,?,?,?,?,?,?)";
		jdbc.update(query,person.getAuthorName(),person.getGender(),person.getBornDate(),person.getBornLocation(),person.getBookTheme(),person.getNumberOfBooksPublished(),person.getLastBookPublishDate());
		logger.info("inserted id" + person.getAuthorId());
		System.out.println(person);
		return person;
	}

	public Author updateValues(Author person) throws SQLException {

		
				String SQL = "update authortable set Author_name=?,Gender=?,Birth_year=?,Birth_place=?,Book_Theme=?,Books_published_count=?,Last_Book_Publish_Date=? where Author_Id=?";
				jdbc.update(SQL,person.getAuthorName(),person.getGender(),person.getBornDate(),person.getBornLocation(),person.getBookTheme(),person.getNumberOfBooksPublished(),person.getLastBookPublishDate(),person.getAuthorId());
				return person;
	}

	public List<Author> authorDetailsList() throws SQLException {

		String SQL = "select * from authortable";
		List<Author> person = jdbc.query(SQL, new AuthorMapper());
		return person;

	}

	public void deleteValues(int authorid) throws SQLException {

		String query = "delete from authortable where Author_Id = ?";
		jdbc.update(query, authorid);
		System.out.println("delete record from authortable");

	}

	public Author authorId(int authorId) throws SQLException {

		String SQL = "select * from authortable where Author_Id=?";
		Author person = jdbc.queryForObject(SQL, new AuthorMapper(),authorId);
		return person;

	}
}