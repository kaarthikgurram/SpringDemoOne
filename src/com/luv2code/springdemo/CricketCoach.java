package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailaddress;
	private String  team;
	
	public CricketCoach(){
		System.out.println("Inside a no arg constructor");
	}
	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside a setter method");
		this.fortuneService = fortuneService;
	}


	public String getDailyWorkout() {
		return "Practise fast bowling for 15 min a day";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


	public String getEmailaddress() {
		return emailaddress;
	}


	public void setEmailaddress(String emailaddress) {
		System.out.println("Inside email address set method");
		this.emailaddress = emailaddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Inside team set method");
		this.team = team;
	}
	
	

}
