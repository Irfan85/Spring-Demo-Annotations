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
	
	// We actually don't need setter methods for injecting dependencies. We can add the "Autowired" annotation to any method
	// and that method will be used to inject dependencies
	@Autowired
	public void foo(FortuneService fortuneService) {
		System.out.println("TennisCoach: Inside the foo method");
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
