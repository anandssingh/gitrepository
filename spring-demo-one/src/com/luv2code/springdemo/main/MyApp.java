package com.luv2code.springdemo.main;

import com.luv2code.springdemo.BaseballCoach;
import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;
import com.luv2code.springdemo.HappyFortuneService;

public class MyApp {

	public static void main(String[] args) {
		
		
		//Coach thecoach = new TrackCoach();
		
		FortuneService theFortuneService = new HappyFortuneService() ;
		Coach thecoach = new BaseballCoach(theFortuneService);
		
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyFortune());
		
		
	}

}
