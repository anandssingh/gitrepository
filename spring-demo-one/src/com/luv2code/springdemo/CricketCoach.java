package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	// create No arg constructor
	public CricketCoach (){
		System.out.println("CricketCoach: inside No arg constructor");
	}

	// setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside Setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach: inside Setter method - setEmail");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside Setter method - setTeam");
		this.team = team;
	}
	
	
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
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
