package com.example.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// This class works as the Spring IoC configuration and is an alternative to the XML approach.
@Configuration
// We can define beans ourselves inside this class. Alternatively, we can also enable component scan by this annotation and point
// it to a package to get bean info by itself.
@ComponentScan("com.example.springdemo")
// We will link the property file if we're using one by this annotation
@PropertySource("classpath:sport.properties")
public class SportConfig {
	// Here we're manually adding a bean definition
	
	// Defining the FortuneService bean. Here, the method name will act as the bean ID.
	@Bean
	public FortuneService cautionFortuneService() {
		return new CautionFortuneService();
	}
	
	// Defining the Coach bean and injecting dependencies
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(cautionFortuneService());
	}
	
}
