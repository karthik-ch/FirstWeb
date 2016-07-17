package com.nisum.firstWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.firstWeb.bean.TestObject;
import com.nisum.firstWeb.bean.User;
import com.nisum.firstWeb.services.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView greetHello() {
		TestObject obj = new TestObject();
		obj.setGreeting("Hello User");
		return new ModelAndView("hello", "data", obj);
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin() {
		User user = new User();
		return new ModelAndView("login", "user", user);
	}

	@RequestMapping(value = "/FirstWeb", method = RequestMethod.GET)
	public ModelAndView showLoginPage() {
		User user = new User();
		return new ModelAndView("login", "user", user);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView showLoginPageEmpty() {
		User user = new User();
		return new ModelAndView("login", "user", user);
	}

	@RequestMapping(value = "/submitLogin", method = RequestMethod.POST)
	public ModelAndView showLogin(@ModelAttribute("user") User user) {
		System.out.println("User Name: " + user.getUserName());
		if (loginService.isValidUser(user)) {
			return new ModelAndView("home", "user", user);
		} else {
			return new ModelAndView("error", "errorMessage", "Your user name or password is not valid. Please check.");
		}
	}

}