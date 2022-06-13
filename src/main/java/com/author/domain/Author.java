package com.author.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
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

}
