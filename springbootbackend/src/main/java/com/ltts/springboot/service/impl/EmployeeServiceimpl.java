package com.ltts.springboot.service.impl;

 
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.springboot.exception.ResorceNotFoundException;
import com.ltts.springboot.model.Employee;
import com.ltts.springboot.repository.EmployeeRepository;
import com.ltts.springboot.service.EmployeeService;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	//@Autowired
	public EmployeeServiceimpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository= employeeRepository;
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		Optional<Employee> employee = employeeRepository.findById(id);
		
		if(employee.isPresent()) {
			return employee.get();
		}
		else {
			throw new ResorceNotFoundException("Employee","Id",id);
		}
		
		
		
		
	}
	@Override
	public Employee updateEmployee(Employee employee, long id) {
		// TODO Auto-generated method stub
		// we need to check with id is present or not
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
				() -> new ResorceNotFoundException("Employee","Id",id));
		
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		
		//to save to DB
		
		employeeRepository.save(existingEmployee);
	
		return existingEmployee;
	}
	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		// we need to check with id is present or not
		employeeRepository.findById(id).orElseThrow(() -> new ResorceNotFoundException("Employee","Id",id));
		employeeRepository.deleteById(id);
		
	}
	@Override
	public Employee getEmployeeById1(long id) {
Optional<Employee> employee = employeeRepository.findById(id);
		
		if(employee.isPresent()) {
			return employee.get();
		}
		else {
			throw new ResorceNotFoundException("Employee","Id",id);
		}
		
	}
	
	}
	
	
	
	
	
	
	



