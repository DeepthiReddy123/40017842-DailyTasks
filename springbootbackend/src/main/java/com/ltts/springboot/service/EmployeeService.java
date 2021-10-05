package com.ltts.springboot.service;

import java.util.List;

import com.ltts.springboot.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee getEmployeeById1(long id);
	Employee updateEmployee(Employee employee , long id);
	//Employee updateEmployeePartially1(Employee employee , long id);
	void deleteEmployee(long id);
	
}
