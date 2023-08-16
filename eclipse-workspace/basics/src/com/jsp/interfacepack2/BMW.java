package com.jsp.interfacepack2;

public class BMW implements Car {

	@Override
	public void start() {
		System.out.println("BMW car is started by using touch panel");
		
	}

	@Override
	public void accelarate() {
		System.out.println("half clutch accelaration");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW car is stoped by using touch panel");
		
		
	}

}
