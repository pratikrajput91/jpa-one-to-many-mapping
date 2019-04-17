package com.capgemini.oneToMany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.oneToMany.certificates.Certificates;
import com.capgemini.oneToMany.entity.Employee;
import com.capgemini.oneToMany.service.EmployeeService;

@RestController
public class OneToManyController {

	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/")
	public void addNew() {
		
		Set<Certificates> certificates= new HashSet();
		certificates.add(new Certificates(201,"JAVA"));
		certificates.add(new Certificates(202,"AWS"));
		
		Employee employee = new Employee(101,"Machine Learning",certificates);
		service.addNew(employee);
	}
	
	@RequestMapping("/new")
	public Employee findData() {
		Employee employee=service.findAll(101);
		return employee;
	}
}
	