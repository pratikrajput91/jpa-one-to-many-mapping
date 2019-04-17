package com.capgemini.oneToMany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.oneToMany.dao.EmployeeDao;
import com.capgemini.oneToMany.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public void addNew(Employee employee) {
		dao.save(employee);
	}

	@Override
	public Employee findAll(int id) {
		
		Employee employee = dao.findById(id).get();
		return employee;
	}

}

