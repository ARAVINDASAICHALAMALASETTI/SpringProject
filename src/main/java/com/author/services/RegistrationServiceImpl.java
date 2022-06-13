package com.author.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.DataBase.RegistrationDao;
import com.author.domain.RegisterForm;
@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationDao form;
	
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
	public RegisterForm getRegisterFormDetailsList(String Email) {
		// TODO Auto-generated method stub
		
		try {
			return form.getRegisterFormDetailsList(Email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<RegisterForm> getAllRegisterFormDetailsList() {
		// TODO Auto-generated method stub
		try {
			return form.getAllRegisterFormDetailsList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
