package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// If we don't provide an explicit bean ID, Spring will give it a default a bean id which is the same as the class name but
// starts with a lower case letter. For this particular class, it will be "tennisCoach"
@Component
public class TennisCoach implements Coach {
	
	// Here, we're using field injection where Spring can inject dependencies directly into their respective fields using
	// a java technology called "reflection"
	@Autowired
	// If we have multiple matching candidates, we have to qualify the dependency. Here, we have to pass a bean ID for which, we can
	// just use the default bean ID that Spring auto generates (Class name that starts with lowercase letter)
	@Qualifier("randomFortuneService")
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
