package com.author.services;

import java.util.List;

import com.author.domain.RegisterForm;

public interface RegistrationService {

	public boolean insertRegisterFormValues(RegisterForm person);
	public RegisterForm getRegisterFormDetailsList(String Email);
	public List<RegisterForm>getAllRegisterFormDetailsList();
}
