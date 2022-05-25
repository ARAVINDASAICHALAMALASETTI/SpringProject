package com.author.exceptions;

import java.util.Date;

import org.springframework.stereotype.Controller;


public class CustomEx  {
	
	Date timestamp;
	Integer code;
	String message;
	public CustomEx(Date timestamp, Integer code, String message) {
		super();
		this.timestamp = timestamp;
		this.code = code;
		this.message = message;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}


