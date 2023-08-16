package com.jsp.downcasting;

public class Icici implements Bank {

	@Override
	public void rateOfInterest() {
		System.out.println("10% rate of interest");
		
	}
	
	public void carLoan() {
		System.out.println("Car loan provided in Icici bank");
	}
	
}
