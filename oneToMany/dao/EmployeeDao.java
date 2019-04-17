package com.capgemini.oneToMany.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.oneToMany.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
