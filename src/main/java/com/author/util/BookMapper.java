package com.author.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.author.domain.AuthorBookDetailsDomain;



	public class BookMapper implements RowMapper<AuthorBookDetailsDomain> {

		@Override
		public AuthorBookDetailsDomain mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			
			AuthorBookDetailsDomain book = new AuthorBookDetailsDomain();
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
