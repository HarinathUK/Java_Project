package com.jsp.interfacepack1;

public class Audi implements Car {
		
	@Override
	public void start() {
		System.out.println("Audi car started by using button");
	}
	
	@Override
	public void accelarate() {
		System.out.println("press accelarate to increase speed");
	}
	@Override
	public void stop() {
		System.out.println("Audi car is stopped by using button");
	}
	
	public void bluetooth() {
		System.out.println("Sony bluetooth device is added in Audi car");
	}
	
	public void airBag() {
		System.out.println("Two additional airbags are added in Audi car");
		System.out.println("*******************************************");
	}
}
