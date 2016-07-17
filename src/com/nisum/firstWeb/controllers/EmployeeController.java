package com.nisum.firstWeb.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.firstWeb.bean.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@RequestMapping(value = "/{name}.json", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")

	public Employee getEmployeeInJSON(@PathVariable String name) {
		return getEmployeeObject(name);
	}

	@RequestMapping(value = "/{name}.xml", method = RequestMethod.GET, produces = "application/xml")
	public Employee getEmployeeInXML(@PathVariable String name) {
		return getEmployeeObject(name);
	}

	private Employee getEmployeeObject(String name) {
		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmail(name + "@nisum.com");
		return emp;
	}

}
