package com.nisum.firstWeb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.nisum.firstWeb.bean.User;
import com.nisum.firstWeb.dao.LoginDao;

@Component
public class LoginService {

	@Autowired
	private LoginDao dao;

	public boolean isValidUser(User user) {
		return getDao().isValidUser(user);
	}

	public LoginDao getDao() {
		return dao;
	}

	public void setDao(LoginDao dao) {
		this.dao = dao;
	}

}
