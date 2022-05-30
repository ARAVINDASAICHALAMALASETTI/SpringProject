package com.author.exceptions;

import java.util.NoSuchElementException;
import java.util.logging.Logger;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	Logger logger = Logger.getLogger(ExceptionController.class.getName());
	
	@ExceptionHandler(value = NoSuchElementException.class)
	public String handleNoSuchElementException(NoSuchElementException ex,Model model){
		logger.info("error" + ex.getMessage());
		 model.addAttribute("error","The value is present in Data Base, Please change your request");
		 return "error";
	}
	
	@ExceptionHandler(value = EmptyResultDataAccessException.class)
	public String handleEmptyResultDataAccessException(EmptyResultDataAccessException ex,Model model){
		logger.info("error" + ex.getMessage());
		 model.addAttribute("error","No value is present in Data Base, Please change your request");
		 return "error";
	}
	@ExceptionHandler(value = DataIntegrityViolationException.class )
	public String handleDataIntegrityViolationException(DataIntegrityViolationException ex,Model model){
		logger.info("error" + ex.getMessage());
		 model.addAttribute("error","cannot delete value because some details linked with this author Id.");
		 return "error";
	}
	
	
	@ExceptionHandler(value = Exception.class)
	public String handleAnyException(Exception ex,Model model){
		logger.info("error" + ex.getMessage());
		 model.addAttribute("error","Some thing went wrong, Please change your request");
		 return "error";
	}
	
	
}
