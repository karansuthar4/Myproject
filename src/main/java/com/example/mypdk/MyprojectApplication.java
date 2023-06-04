package com.example.mypdk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyprojectApplication {
	@GetMapping(value="/")
	public String index() {
		return "<h1> hello world i am karan suthar</h1>";
		
	}
	

	public static void main(String[] args) {
		SpringApplication.run(MyprojectApplication.class, args);
	}

}
