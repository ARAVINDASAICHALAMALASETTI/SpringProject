package com.author.validation;

import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.author.domain.Author;

public class ValidationUtil {
	

	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-mm-dd");

	public static String validate(Author person) {
		
		String name = person.getAuthorName();
		String gender = person.getGender();
		Date born = person.getBornDate();
		String bornLocation = person.getBornLocation();
		String bookTheme = person.getBookTheme();
		Integer bookCount = person.getNumberOfBooksPublished();
		Date lastBookDate = person.getLastBookPublishDate();
		String error = "";
		if (name == null || name.trim().length() == 0) {
			error = "name should not be empty";
		} else if (gender == null || gender.trim().length() == 0) {
			error = "gender should not be empty";
		} else if (born == null || String.valueOf(born).trim().length() == 0) {
			error = "born should not be empty";
		} else if (bornLocation == null || bornLocation.trim().length() == 0) {
			error = "bornLocation should not be empty";
		} else if (bookTheme == null || bookTheme.trim().length() == 0) {
			error = "bookTheme should not be empty";
		} else if (bookCount == null) {
			error = "bookCount should not be empty";
		}else if (lastBookDate == null || String.valueOf(lastBookDate).trim().length() == 0) {
			error = "lastBookDate should not be empty";
		}
		

		return error;
}
}