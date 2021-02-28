package com.madeye.springapplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//Create the object
//		Coach theCoach = new BaseballCoach();
		//Use the object
//		System.out.println(theCoach.getDailyWorkout());
		
//		Coach badmintonCoach = new BadmintonCoach();
//		System.out.println(badmintonCoach.getDailyWorkout());
		
		
//		DEMO OF IOC & DI
//		DI - Constructor Injection
		
//		Step 1: Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		================================================
//		
//		Step 2: retrieve bean from spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		Coach BaseballC = context.getBean("baseBallCoach", Coach.class);

//		Step 3: call methods on the bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
//		Step 3.1: Call method on another bean using same constructor
		System.out.println(BaseballC.getDailyWorkout());
		System.out.println(BaseballC.getDailyFortune());
		
//		================================================
		
		
//		DI - Setter Injection
//		================================================
		
//		Step 2: retrieve bean from spring container
		CriketCoach criketCoach = context.getBean("cricketCoach", CriketCoach.class);
		
//		Step 3: Call method on the bean
		System.out.println(criketCoach.getDailyWorkout());
		System.out.println(criketCoach.getDailyFortune());
		
//		Step 3.1: Call injected literal values
		System.out.println(criketCoach.getTeam());
		System.out.println(criketCoach.getEmail());
		
//		================================================

//		Step 4: Close the context
		context.close();

		
	}

} 
