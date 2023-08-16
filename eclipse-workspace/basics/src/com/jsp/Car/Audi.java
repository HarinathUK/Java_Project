package com.jsp.Car;

public class Audi extends Car {
	
	Audi(String color, String model) {
		super(color, model);
	}
	@Override
	public void carDetails() {
		System.out.println("color: " + color);
		System.out.println("model: " + model);
	}
	@Override
	public void start() {
		System.out.println("Use button to start Audi car");
	}
	
	@Override
	public void accelarate() {
		System.out.println("press accelarate");
	}
	
	@Override
	public void stop( ) {
		System.out.println("use button to stop the Audi car");
		System.out.println("**********************************");
	}

}
