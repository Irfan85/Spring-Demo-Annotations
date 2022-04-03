package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// If we don't provide an explicit bean ID, Spring will give it a default a bean id which is the same as the class name but
// starts with a lower case letter. For this particular class, it will be "tennisCoach"
@Component
public class TennisCoach implements Coach {

	public FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("TennisCoach: inside the no-arg constructor");
	}
	
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	// Here, "Autowired" annotation tells Spring object factory to search for components/classes that matches with the dependency in the
	// argument of the setter method
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach: Inside the setFortuneService method");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
