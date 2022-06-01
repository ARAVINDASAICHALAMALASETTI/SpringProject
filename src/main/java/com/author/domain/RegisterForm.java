package com.author.domain;



import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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
public class RegisterForm {

	private Integer registerId;
	@NotEmpty(message = "userName can't be null")
	@Size(min = 3,message="use minimum 3 character's or more than 3 character's")
	@Size(max = 25,message="not use more than length 25 character's")
	private String userName;
	@NotEmpty(message = "gender can't be null")
	@Size(min = 4,message="use minimum 4 character's")
	@Size(max = 6,message="not use more than length 6 character's")
	private String gender;
	@NotEmpty(message = "Email can't be null")
	@javax.validation.constraints.Email(message = "Email is not valid", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
	@Size(min = 15,message="use minimum 15 character's or more than 15 character's")
	@Size(max = 45,message="not use more than length 45 character's")
	private String Email;
	@NotEmpty(message = "password can't be null")
	@Size(min = 8,message="use minimum 8 character's or more than 5 character's")
	@Size(max = 20,message="not use more than length 20 character's")
	@Pattern(message = "not strong password" ,regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,})")
	//@Pattern(message = "not strong password" , regexp = "(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])")
	private String password;
	@NotNull(message = "phoneNumber can't be null")
	//@Size(min = 10 ,message="not use less than 10 digits")
	//@Size(max = 11,message="not use more than 10 digits")
	private Long phoneNumber;
	
}
