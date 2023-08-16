package com.jsp.downcasting;

public class State implements Bank {

	@Override
	public void rateOfInterest() {
		System.out.println("12% rate of interest");
		
	}
	
	public void homeLoan() {
		System.out.println("Home loan provided in state bank");
	}

}
