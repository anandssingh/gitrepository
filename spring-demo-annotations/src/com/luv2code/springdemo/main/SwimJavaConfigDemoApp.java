package com.luv2code.springdemo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.SportConfig;
import com.luv2code.springdemo.SwimCoach;
import com.luv2code.springdemo.TennisCoach;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		
				// load spring config file
				AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(SportConfig.class);
				
				// retrive spring bean file
				//Coach thecoach = context.getBean("swimCoach", Coach.class);
				
				
				SwimCoach thecoach = context.getBean("swimCoach", SwimCoach.class);
				

				// call the method on beans
				System.out.println(thecoach.getDailyWorkout());
				System.out.println(thecoach.getDailyFortune());
				System.out.println(thecoach.getEmail());
				System.out.println(thecoach.getTeam());
				
				//close context
				context.close();

	}

}
