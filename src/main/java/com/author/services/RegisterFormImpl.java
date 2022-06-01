package com.author.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.domain.RegisterForm;
import com.author.util.RegisterFormUtil;
@Service
public class RegisterFormImpl implements RegisterService {

	@Autowired
	RegisterFormUtil form;
	
	@Override
	public boolean insertRegisterFormValues(RegisterForm person) {
		// TODO Auto-generated method stub
		
		try {
			form.insertRegisterFormValues(person);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<RegisterForm> getRegisterFormDetailsList() {
		// TODO Auto-generated method stub
		
		try {
			return form.getRegisterFormDetailsList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
