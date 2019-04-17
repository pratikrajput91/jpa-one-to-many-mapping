package com.capgemini.oneToMany.service;

import com.capgemini.oneToMany.entity.Employee;

public interface EmployeeService {

	public void addNew(Employee employee);
	public Employee findAll(int id);
	
}
