package com.luv2code.springboot.demo.myBootcoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	
	@GetMapping("/")
	public String sayHello()
	{
		return "Hello World Time on Server is ";
	}
	
	
	@GetMapping("/workout")
	public String getDailyWorkout()
	{
		return "run daily 5k ";
	}
	
	@GetMapping("/fotune")
	public String getFortune()
	{
		return "run daily 5k fotune ";
	}
	
	
}
