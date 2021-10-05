package com.ltts.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    // http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Deepthi", "Reddy");
		
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students=new ArrayList<>();
		students.add(new Student("Deepthi","Reddy"));
		students.add(new Student("Dileep","Reddy"));
		students.add(new Student("Sai","Reddy"));
		students.add(new Student("Sinchu","Gowda"));
		return students;
		
	}
	
	// @PathVariable annotation ---to bind URI template path variable to the method variable
	@GetMapping("/student/{firstname}/{lastname}")
	// http://localhost:8080/student/deepthi/reddy
	public Student studentpathvariable(@PathVariable("firstname") String firstname,@PathVariable("lastname") String lastname) {
		return new Student(firstname, lastname);
		
	}
	
	
	
	// build rest API to handle query parameters or web request parameters
	
	// http://localhost:8080/student1?firstname=deepthi&lastname=reddy
	@GetMapping("/student1")
	public Student studentQueryParam(@RequestParam(name="firstname") String firstname ,@RequestParam(name="lastname")  String lastname) {
		return new Student(firstname, lastname);
	}
	
	
	
}

