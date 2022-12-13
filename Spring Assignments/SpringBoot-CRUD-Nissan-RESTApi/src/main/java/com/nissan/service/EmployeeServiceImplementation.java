package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IEmployeeDAO;
import com.nissan.model.Employee;

@Service
public class EmployeeServiceImplementation implements IEmployeeService {

	@Autowired                        //creating the objects automatically
	IEmployeeDAO employeeDAO;
	
	@Override
	public List<Employee> listAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}

	@Override
	public Employee searchByPhoneNumber(String _phoneNumber) {
		// TODO Auto-generated method stub
		Employee employee = employeeDAO.searchByPhoneNumber(_phoneNumber);
		
		//check condition
		if(_phoneNumber.equals(employee.getEmpPhoneNumber()) && employee.getIsActive())
		{
			return employee;
		}else {
			return null;
		}
		
	}

	@Override
	@Transactional     //for add and delete we used transactional
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.save(employee);
	}

}
