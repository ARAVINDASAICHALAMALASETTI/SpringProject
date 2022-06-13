package com.author.DataBase;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.author.domain.Author;

@Component
public class AuthorDao {
	
	Logger logger = Logger.getLogger(AuthorDao.class.getName());

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

	public Author authorId(int authorId, String authorName,String bornLocation,String bookTheme) throws SQLException {

		//String SQL = ("select * from authortable p where" + "p.Author_Id LIKE CONCAT('%',:?,'%')" + "Or p.Author_name LIKE CONCAT('%',:?,'%')" + "Or p.Birth_place LIKE CONCAT('%',:?,'%')" + "Or p.Book_Theme LIKE CONCAT('%',:?,'%')");
		String SQL = ("select * from authortable p where p.Author_Id LIKE CONCAT %?1%" + "Or p.Author_name LIKE CONCAT %?1%" + "Or p.Birth_place LIKE CONCAT %?1%" + "Or p.Book_Theme LIKE CONCAT %?1%");
		boolean nativeQuery = true;
		Author person = jdbc.queryForObject(SQL, new AuthorMapper(),authorId,authorName,bornLocation,bookTheme);
		return person;

	}//bookTheme
	
	public Author authorById(int authorId) throws SQLException {

		String SQL = "select * from authortable where Author_Id=?";
		Author person = jdbc.queryForObject(SQL, new AuthorMapper(),authorId);
		return person;

	}
	
	public Author bornLocation(String  bornLocation) throws SQLException {

		String SQL = "select * from authortable where Birth_place=?";
		Author person = jdbc.queryForObject(SQL, new AuthorMapper(),bornLocation);
		return person;

	}
	
	public Author bookTheme(String  bookTheme) throws SQLException {

		String SQL = "select * from authortable where Book_Theme=?";
		Author person = jdbc.queryForObject(SQL, new AuthorMapper(),bookTheme);
		return person;

	}
}