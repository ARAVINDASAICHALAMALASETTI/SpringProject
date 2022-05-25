package com.author.services;

public class UserServiceImpl implements UserService{

	@Override
	public boolean isValid(String userName, String password) {
		// TODO Auto-generated method stub
		if(userName.equals("arvindsai123@gmail.com") && password.equals("As1asdf")){
			return true;
		}
		return false;
	}

	

}
