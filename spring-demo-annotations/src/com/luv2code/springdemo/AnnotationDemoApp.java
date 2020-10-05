package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		
				// load spring config file
				ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				// retrive spring bean file
				//Coach thecoach = context.getBean("tennisCoach", Coach.class);
				
				
				TennisCoach thecoach = context.getBean("tennisCoach", TennisCoach.class);
				

				// call the method on beans
				System.out.println(thecoach.getDailyWorkout());
				System.out.println(thecoach.getDailyFortune());
				System.out.println(thecoach.getEmail());
				System.out.println(thecoach.getTeam());
				
				//close context
				context.close();

	}

}
