package com.author.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Author {

	// private variable
	private Integer authorId;
	private String authorName;
	private String gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bornDate;
	private String bornLocation;
	private String bookTheme;
	private Integer numberOfBooksPublished;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date lastBookPublishDate;

	public Author(Integer authorId, String authorName, String gender, Date bornDate, String bornLocation,
			String bookTheme, Integer numberOfBooksPublished, Date lastBookPublishDate) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.gender = gender;
		this.bornDate = bornDate;
		this.bornLocation = bornLocation;
		this.bookTheme = bookTheme;
		this.numberOfBooksPublished = numberOfBooksPublished;
		this.lastBookPublishDate = lastBookPublishDate;
	}

	public Author() {
		// TODO Auto-generated constructor stub
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public String getBornLocation() {
		return bornLocation;
	}

	public void setBornLocation(String bornLocation) {
		this.bornLocation = bornLocation;
	}

	public String getBookTheme() {
		return bookTheme;
	}

	public void setBookTheme(String bookTheme) {
		this.bookTheme = bookTheme;
	}

	public Integer getNumberOfBooksPublished() {
		return numberOfBooksPublished;
	}

	public void setNumberOfBooksPublished(Integer numberOfBooksPublished) {
		this.numberOfBooksPublished = numberOfBooksPublished;
	}

	public Date getLastBookPublishDate() {
		return lastBookPublishDate;
	}

	public void setLastBookPublishDate(Date lastBookPublishDate) {
		this.lastBookPublishDate = lastBookPublishDate;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", gender=" + gender + ", bornDate="
				+ bornDate + ", bornLocation=" + bornLocation + ", bookTheme=" + bookTheme + ", numberOfBooksPublished="
				+ numberOfBooksPublished + ", lastBookPublishDate=" + lastBookPublishDate + "]";
	}

}
