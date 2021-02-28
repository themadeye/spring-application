package com.madeye.springapplication;

public class BaseballCoach implements Coach{
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// USE MY FORTUNESERVICE TO GET A FORTUNE
		return "From baseball coach ! " + fortuneService.getFortune();
	}

}
