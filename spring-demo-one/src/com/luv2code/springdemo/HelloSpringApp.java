package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// load spring config file
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive spring bean file
		Coach thecoach = context.getBean("myCoach", Coach.class);
		
		// call the method on beans
		System.out.println(thecoach.getDailyWorkout());
		
		
		//close context
		context.close();

	}

}
