package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	
	//Define a private field for the dependency 
		private FortuneService fortuneService;

		public TrackCoach(FortuneService fortuneService) {
			super();
			this.fortuneService = fortuneService;
		}
	
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run Hard 5K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it " + fortuneService.getFortune();
	}
	
	
	
	public void doMyStartUpStuff()
	{
		System.out.println("inside my doMyStartUpStuff");
	}
	
	public void doMyCleanUpStuff()
	{
		System.out.println("inside my doMyCleanUpStuff");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
