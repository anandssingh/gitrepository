package com.luv2code.springdemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		
		// load spring config file
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive spring bean file
		Coach thecoach = context.getBean("myCoach", Coach.class);
		
		// call the method on beans
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyFortune());
		
		
		//close context
		context.close();

	}

}
