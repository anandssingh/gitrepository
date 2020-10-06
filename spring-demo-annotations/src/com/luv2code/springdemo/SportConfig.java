package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	
	
	
	
	// define bean for fortune service... speciallly for sad fortune service
	@Bean
	public FortuneService fortuneService()
	{
		return new SadFortuneService();
	}
	
	// define bean for swimcoach
	
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(fortuneService());
	}
	
	
	
	
	
	
}
