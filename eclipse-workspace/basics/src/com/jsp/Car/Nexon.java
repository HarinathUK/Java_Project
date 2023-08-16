package com.jsp.Car;

public class Nexon extends Car {
	Nexon(String color, String model) {
		super(color, model);
	}
	@Override
	public void carDetails() {
		System.out.println("color: " + color);
		System.out.println("model: " + model);
		
	}
	@Override
	public void start() {
		System.out.println("Use key to start Nexon car");
	}
	
	@Override
	public void accelarate() {
		System.out.println("press accelarate");
	}
	
	@Override
	public void stop( ) {
		System.out.println("use key to stop the Nexon car");
		System.out.println("********************************");

}
}
