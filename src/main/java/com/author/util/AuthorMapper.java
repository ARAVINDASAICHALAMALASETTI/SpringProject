package com.author.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.author.domain.Author;

public class AuthorMapper implements RowMapper<Author> {

	@Override
	public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Author author = new Author();
		author.setAuthorId(rs.getInt("Author_Id"));
		author.setAuthorName(rs.getString("Author_name"));
		author.setGender(rs.getString("Gender"));
		author.setBornDate(rs.getDate("Birth_year"));
		author.setBornLocation( rs.getString("Birth_place"));
		author.setBookTheme(rs.getString("Book_Theme"));
		author.setNumberOfBooksPublished(rs.getInt("Books_published_count"));
		author.setLastBookPublishDate(rs.getDate("Last_Book_Publish_Date"));
		return author;
	}

}
