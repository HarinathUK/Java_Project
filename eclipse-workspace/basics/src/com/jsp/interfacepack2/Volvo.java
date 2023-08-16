package com.jsp.interfacepack2;

public class Volvo implements Car {

	@Override
	public void start() {
		System.out.println("Volvo car is started by using rotating knab");
		
	}

	@Override
	public void accelarate() {
		System.out.println("Full clutch accelaration");
		
	}

	@Override
	public void stop() {
		System.out.println("Volvo car is started by using rorating knab");
		
	}
	
	@Override
	public void gps() {
		System.out.println("gps is activated");
	}

}
