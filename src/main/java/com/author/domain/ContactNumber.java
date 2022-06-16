package com.author.domain;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.author.validation.PhoneNumber;

public class ContactNumber implements ConstraintValidator<PhoneNumber, Long>{
	
	private int lower;
	private int upper;
	
	@Override
	public void initialize(PhoneNumber number) {
		// TODO Auto-generated method stub
		this.lower = number.lower();
		this.upper = number.upper();
	}

	@Override
	public boolean isValid(Long number, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		if(number == null) {
			return false;
		}
		
		if( number < lower || number > upper) {
			return false;
		}
		
		return true;
	}

}
