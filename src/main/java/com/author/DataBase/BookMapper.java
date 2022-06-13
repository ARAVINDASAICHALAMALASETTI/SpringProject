package com.author.DataBase;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.author.domain.AuthorBooks;



	public class BookMapper implements RowMapper<AuthorBooks> {

		@Override
		public AuthorBooks mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			
			AuthorBooks book = new AuthorBooks();
			book.setAuthorId(rs.getInt("Author_Id"));
			book.setBookName(rs.getString("Book_name"));
			book.setBookPagesCount(rs.getInt("Book_Pages_count"));
			book.setBookPublishDate(rs.getDate("Book_Publish_Date"));
			book.setJointAuthorship(rs.getString("Joint_Authorship"));
			book.setBookLanguage(rs.getString("Book_Language"));
			book.setBookPrice(rs.getString("Book_Price"));
			book.setPublishment(rs.getString("Publishment"));
			book.setBookId(rs.getInt("Book_Id"));
			return book;
		}

	}
