package com.ltts.springboot;

	
	import org.springframework.web.bind.annotation.GetMapping;
	
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class EmployeeController {
	    // http://localhost:8080/employee
		@GetMapping("/employee")
		public Employee getEmployee() {
			return new Employee(40017842 ,"Deepthi", "Associate Engineer");
			
		}
		
		
}
