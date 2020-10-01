package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		
				// load spring config file
				ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
				// retrive spring bean file
				Coach thecoach = context.getBean("myCoach", Coach.class);
				Coach alphacoach = context.getBean("myCoach", Coach.class);
				

				boolean result = (thecoach == alphacoach);
				
				System.out.println(result);
				System.out.println(thecoach);
				System.out.println(alphacoach);
				
				
				//close context
				context.close();

	}

}
