package com.author.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.author.domain.ContactNumber;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ContactNumber.class)
public @interface PhoneNumber {
	int lower() default 10;

	int upper() default 11;

	String message() default "phone number must be 10 digits";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
