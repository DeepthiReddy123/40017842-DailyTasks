package com.ltts.springboot;



//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/*
@Controller //to make the below class as spring MVC class
@ResponseBody//convert java object to json or xml and it will send back to client
*/
@RestController // combination of @Controller and  @ResponseBody and   controls web request and rest api request 
public class HelloWorldController {
  
	// GET HTTP Method
	//http://localhost:8080/hello-world  ---when client access API with this url it return hello world
	@GetMapping("/hello-world") //used to serve the method as a rest api and it can handle http get
	public String helloWorld()
	{
		return "Hello World !!!";
		
	}
}
     