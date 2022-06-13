package com.author.DataBase;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.author.domain.RegisterForm;

public class RegisterMapper implements RowMapper<RegisterForm>{
	@Override
	public RegisterForm mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		RegisterForm register = new RegisterForm();
		register.setRegisterId(rs.getInt("Register_Id"));
		register.setUserName(rs.getString("User_name"));
		register.setGender(rs.getString("Gender"));
		register.setEmail(rs.getString("E_mail"));
		register.setPassword(rs.getString("Password"));
		register.setPhoneNumber(rs.getLong("Phone_Number"));
		return register;
	}
}

//Register_Id, User_name, Gender,E_mail,Password,Phone_Number