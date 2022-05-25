package com.author.exceptions;

import java.util.Date;
import java.util.NoSuchElementException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class CustomController {

	@ExceptionHandler(value = NoSuchElementException.class)
	public ResponseEntity<String> handleEmptyResultDataAccessException(NoSuchElementException elementException){
		return new ResponseEntity<String>("The value is present in Data Base, Please change your request", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = EmptyResultDataAccessException.class)
	public ResponseEntity<CustomEx> handleNoSuchElementException(EmptyResultDataAccessException elementException){
		CustomEx Ce = new CustomEx(new Date(), 601, "No value is present in Data Base");
		return new ResponseEntity<CustomEx>(Ce, HttpStatus.BAD_REQUEST);
	}
	
	/*@ExceptionHandler(value = EmptyResultDataAccessException.class)
	public ResponseEntity<String> handleEmptyResultDataAccessException(EmptyResultDataAccessException elementException){
		return new ResponseEntity<String>("No value is present in Data Base, Please change your request", HttpStatus.NOT_FOUND);
	}*/
	
	@ExceptionHandler(value = DataIntegrityViolationException.class)
	public ResponseEntity<String> handleDataIntegrityViolationException(DataIntegrityViolationException elementException){
		return new ResponseEntity<String>("cannot delete value because some details linked with this author Id.", HttpStatus.FAILED_DEPENDENCY);
	}
	
	@ExceptionHandler(value = {MethodArgumentTypeMismatchException.class , NumberFormatException.class})
	public ResponseEntity<String> handleDataIntegrityViolationException(MethodArgumentTypeMismatchException elementException){
		return new ResponseEntity<String>("No value in Database and you enter wrong data, please enter valid data.", HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(value = HttpMessageNotReadableException.class)
	public ResponseEntity<String> handleDataIntegrityViolationException(HttpMessageNotReadableException elementException){
		return new ResponseEntity<String>("Please enter valid data only.", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<String> handleAnyException(Exception elementException){
		return new ResponseEntity<String>("Some thing went wrong, Please enter valid Data.", HttpStatus.SERVICE_UNAVAILABLE);
	}
	
	
}
