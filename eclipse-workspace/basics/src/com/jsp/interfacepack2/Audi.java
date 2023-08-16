package com.jsp.interfacepack2;

public class Audi implements Car {
	@Override 
	public void start() {
		System.out.println("Audi car is started by using button");
	}
	
	@Override 
	public void accelarate() {
		System.out.println("Full clutch accelation");
	}
	
	@Override 
	public void stop() {
		System.out.println("Audi car is stoped by using button");
	}
}
