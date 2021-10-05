package com.ltts.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltts.springboot.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Optional<Employee> findByname(String firstname, String lastname);

	//Employee save(Employee employee);

}
