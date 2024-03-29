package com.madeye.springapplication;

public class BadmintonCoach implements Coach{
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BadmintonCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do 100 smash shot";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStaff() {
		System.out.println("BadmintonCoach: inside method startup");
	}
	
	// add a destroy method
	public void doMyCleanUpStuff() {
		System.out.println("BadmintonCoach: inside method cleaning");
	}
}
