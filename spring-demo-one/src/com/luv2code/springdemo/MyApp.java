package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		
		//Coach thecoach = new TrackCoach();
		
		FortuneService theFortuneService = new HappyFortuneService() ;
		Coach thecoach = new BaseballCoach(theFortuneService);
		
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyFortune());
		
		
	}

}
