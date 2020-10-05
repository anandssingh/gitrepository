package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		
				// load spring config file
				ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				// retrive spring bean file
				TennisCoach thecoach = context.getBean("tennisCoach", TennisCoach.class);
				TennisCoach alphacoach = context.getBean("tennisCoach", TennisCoach.class);
				

				boolean result = (thecoach == alphacoach);
				
				System.out.println(result);
				System.out.println(thecoach);
				System.out.println(alphacoach);
				
				
				//close context
				context.close();

	}

}
