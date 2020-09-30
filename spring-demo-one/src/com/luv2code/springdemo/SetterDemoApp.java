package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		
		// load spring config file
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive spring bean file
		Coach thecoach = context.getBean("myCricketCoach", Coach.class);
		
		// call the method on beans
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyFortune());
		
		
		//close context
		context.close();

		
	}

}
