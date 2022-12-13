package com.nissan.service;

import java.util.List;

import com.nissan.model.Employee;

public interface IEmployeeService {

	
	
	// get a list of employees
	List<Employee> listAllEmployee();
	
	//get a single employee by id
	Employee searchByPhoneNumber(String _phoneNumber);
	
	//Add an employee
	Employee addEmployee(Employee employee);
	
	//Update an employee
	
	
	//Delete an employee
	
	
	
}
