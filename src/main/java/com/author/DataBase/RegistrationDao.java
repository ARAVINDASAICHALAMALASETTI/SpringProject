package com.author.DataBase;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.author.domain.Author;
import com.author.domain.RegisterForm;

@Component
public class RegistrationDao {
	Logger logger = Logger.getLogger(RegistrationDao.class.getName());
	@Autowired
	JdbcTemplate jdbc;

	public void createTable() throws Exception {

		jdbc.execute(
				"create table registerTable(Register_Id int PRIMARY KEY AUTO_INCREMENT , User_name  varchar(30), Gender varchar(06), E_mail varchar(50),Password  varchar(25),Phone_Number BIGINT(10))");

		System.out.println("register table created");

	}

	public RegisterForm insertRegisterFormValues(RegisterForm person) throws Exception {

		String query = "insert into registerTable (Register_Id, User_name, Gender,E_mail,Password,Phone_Number) Values(?,?,?,?,?,?)";
		jdbc.update(query, person.getRegisterId(), person.getUserName(), person.getGender(), person.getEmail(),person.getPassword(), person.getPhoneNumber());
		logger.info("inserted id" + person.getRegisterId());
		return person;

	}

	public RegisterForm getRegisterFormDetailsList(String Email) throws SQLException {

		String SQL = "select * from registerTable where E_mail=?";
		RegisterForm person = jdbc.queryForObject(SQL, new RegisterMapper(), Email);
		return person;

	}

	public List<RegisterForm> getAllRegisterFormDetailsList() throws SQLException {

		String SQL = "select * from registerTable";
		List<RegisterForm> person = jdbc.query(SQL, new RegisterMapper());
		return person;

	}
}
