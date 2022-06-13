package com.author.domain;

import java.util.Date;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class AuthorBooks {

	// private variable
	private Integer authorId;
	@NotEmpty(message = "bookName can't be null")
	@Size(min = 5,message="use minimum 5 character's or more than 5 character's")
	@Size(max = 35,message="not use more than length 35 character's")
	private String bookName;
	@NotNull(message = "bookPagesCount can't be null")
	@Min(value = 80, message = "use minimum Pages count equal to 80 or more than 80 pages")
	private Integer bookPagesCount;
	@NotNull(message = "Date can't be null")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bookPublishDate;
	@NotEmpty(message = "jointAuthorship can't be null")
	@Size(min = 3,message="use minimum 3 character's or more than 3 character's")
	@Size(max = 30,message="not use more than length 30 character's")
	private String jointAuthorship;
	@NotEmpty(message = "bookLanguage can't be null")
	@Size(min = 6,message="use minimum 6 character's or more than 6 character's")
	@Size(max = 25,message="not use more than length 25 character's")
	private String bookLanguage;
	@NotEmpty(message = "bookPrice can't be null")
	@Size(min = 4,message="use minimum 4 character's or more than 4 character's")
	@Size(max = 8,message="not use more than length 8 character's")
	private String bookPrice;
	@NotEmpty(message = "publishment can't be null")
	@Size(min = 10,message="use minimum 10 character's or more than 10 character's")
	@Size(max = 25,message="not use more than length 25 character's")
	private String publishment;
	private Integer bookId;

	// constructor with arguments

	public AuthorBooks(Integer authorId, String bookName, Integer bookPagesCount, Date bookPublishDate,
			String jointAuthorship, String bookLanguage, String bookPrice, String publishment, Integer bookId) {
		super();
		this.authorId = authorId;
		this.bookName = bookName;
		this.bookPagesCount = bookPagesCount;
		this.bookPublishDate = bookPublishDate;
		this.jointAuthorship = jointAuthorship;
		this.bookLanguage = bookLanguage;
		this.bookPrice = bookPrice;
		this.publishment = publishment;
		this.bookId = bookId;
	}

	public AuthorBooks() {
		// TODO Auto-generated constructor stub
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer getBookPagesCount() {
		return bookPagesCount;
	}

	public void setBookPagesCount(Integer bookPagesCount) {
		this.bookPagesCount = bookPagesCount;
	}

	public Date getBookPublishDate() {
		return bookPublishDate;
	}

	public void setBookPublishDate(Date bookPublishDate) {
		this.bookPublishDate = bookPublishDate;
	}

	public String getJointAuthorship() {
		return jointAuthorship;
	}

	public void setJointAuthorship(String jointAuthorship) {
		this.jointAuthorship = jointAuthorship;
	}

	public String getBookLanguage() {
		return bookLanguage;
	}

	public void setBookLanguage(String bookLanguage) {
		this.bookLanguage = bookLanguage;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getPublishment() {
		return publishment;
	}

	public void setPublishment(String publishment) {
		this.publishment = publishment;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "AuthorBookDetailsDomain [authorId=" + authorId + ", bookName=" + bookName + ", bookPagesCount="
				+ bookPagesCount + ", bookPublishDate=" + bookPublishDate + ", jointAuthorship=" + jointAuthorship
				+ ", bookLanguage=" + bookLanguage + ", bookPrice=" + bookPrice + ", publishment=" + publishment
				+ ", bookId=" + bookId + "]";
	}

}
