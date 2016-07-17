package com.nisum.firstWeb.dao;

import org.springframework.stereotype.Component;

import com.nisum.firstWeb.bean.User;

@Component
public class LoginDao {
	
	public static String userName = "test";
	public static String password = "test";
	
	public boolean isValidUser(User user) {
		return userName.equals(user.getUserName()) && password.equals(user.getPassword());
	}

}
