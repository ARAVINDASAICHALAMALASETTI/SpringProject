package com.author.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;

public class ValidationBook {
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public static String validate(HttpServletRequest request) {
		
		//String authorid = request.getParameter("id");
		String name = request.getParameter("name");
		String pages = request.getParameter("pages");
		String date = request.getParameter("date");
		String joint = request.getParameter("joint");
		String language = request.getParameter("language");
		String price = request.getParameter("price");
		
		String error = "";
		
		if (name == null || name.trim().length() == 0) {
			error = "bookname should not be empty";
		} else if (pages == null || pages.trim().length() == 0) {
			error = "bookpages should not be empty";
		} else if (date == null || date.trim().length() == 0) {
			error = "book publish date should not be empty";
		} else if (joint == null || joint.trim().length() == 0) {
			error = "jointAuthorship should not be empty";
		} else if (language == null || language.trim().length() == 0) {
			error = "book language should not be empty";
		}else if (price == null || price.trim().length() == 0) {
			error = "book price should not be empty";
		}
		if (date != null && date.trim().length() > 0) {
			try {
				LocalDate.parse(date, dtf);
			} catch (Exception e) {
				error = String.format("invalid date.error:%s", e.getMessage());
			}

		}
		
		return error;
}
}
