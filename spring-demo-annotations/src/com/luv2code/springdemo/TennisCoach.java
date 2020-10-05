package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.test.context.event.annotation.PrepareTestInstance;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	
	
	@Override
	public String getDailyWorkout() {
		//fortuneService.getFortune();
		return "That silly Coach";
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
