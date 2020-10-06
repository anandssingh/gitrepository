package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyWorkout() {
		return "Swim 1k ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	
	

	@PostConstruct
	public void doMyStartUpStuff()
	{
		System.out.println("inside my doMyStartUpStuff");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff()
	{
		System.out.println("inside my doMyCleanUpStuff");
	}
	
	
	
	
	
	

}
