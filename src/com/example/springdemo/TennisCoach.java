package com.example.springdemo;

import org.springframework.stereotype.Component;

// If we don't provide an explicit bean ID, Spring will give it a default a bean id which is the same as the class name but
// starts with a lower case letter. For this particular class, it will be "tennisCoach"
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}

}
