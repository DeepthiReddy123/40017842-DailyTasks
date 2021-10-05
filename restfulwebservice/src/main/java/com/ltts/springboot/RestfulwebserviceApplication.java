package com.ltts.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication/* combination of @SpringBootConfiguration - has @Configuration which make java class as spring configuration ,
@EnableAutoConfiguration--enables auto-configuration for spring boot , 
@ComponentScan--to mark the package under which all the components to be scanned*/
public class RestfulwebserviceApplication {// since this has @Configuration annotation we can use this class as spring configuration class 

	public static void main(String[] args) {
		SpringApplication.run(RestfulwebserviceApplication.class, args);
	}

}
