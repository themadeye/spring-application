package com.madeye.springapplication;

public class CriketCoach implements Coach{
	
	private FortuneService fortuneService;
	private String email;
	private String team;

//	==================== CONSTRUCTOR ====================
//	- Create a no-arguments constructor
	public CriketCoach() {
		System.out.println("CriketCoach: inside no-arg");
	}

//	==================== GETTER & SETTER ====================
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CriketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
//		System.out.println("CriketCoach: getEmail");
		return email;
	}

	public void setEmail(String email) {
//		System.out.println("CriketCoach: setEmail");
		this.email = email;
	}

	public String getTeam() {
//		System.out.println("CriketCoach: getTeam");
		return team;
	}

	public void setTeam(String team) {
//		System.out.println("CriketCoach: setTeam");
		this.team = team;
	}

//	==================== METHODS ====================
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
