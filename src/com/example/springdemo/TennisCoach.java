package com.example.springdemo;

import org.springframework.stereotype.Component;

// Spring will use this annotation to identify beans. Here, we have to provide the bean id
@Component("myTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}

}
