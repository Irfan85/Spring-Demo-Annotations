package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// If we don't provide an explicit bean ID, Spring will give it a default a bean id which is the same as the class name but
// starts with a lower case letter. For this particular class, it will be "tennisCoach"
@Component
public class TennisCoach implements Coach {
	
	// Here, we're using field injection where Spring can inject dependencies directly into their respective fields using
	// a java technology called "reflection"
	@Autowired
	public FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("TennisCoach: inside the no-arg constructor");
	}
	
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void foo(FortuneService fortuneService) {
//		System.out.println("TennisCoach: Inside the foo method");
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
