package com.author.services;

import java.util.List;

import com.author.domain.RegisterForm;

public interface RegisterService {

	public boolean insertRegisterFormValues(RegisterForm person);
	public List<RegisterForm> getRegisterFormDetailsList();
}
