package com.luv2code.springdemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		
				// load spring config file
				ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
				
				// retrive spring bean file
				Coach thecoach = context.getBean("myCoach", Coach.class);
				

				// call the method on beans
				System.out.println(thecoach.getDailyWorkout());
				
				
				
				//close context
				context.close();

	}

}
