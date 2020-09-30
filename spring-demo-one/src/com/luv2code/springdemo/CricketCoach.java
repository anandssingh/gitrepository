package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	// create No arg constructor
	public CricketCoach (){
		System.out.println("CricketCoach: inside No arg constructor");
	}

	// setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside Setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Pratice fast boalwing for 15 mins a day";
	}

	@Override
	public String getDailyFortune() {
		return  fortuneService.getFortune();
	}

}
