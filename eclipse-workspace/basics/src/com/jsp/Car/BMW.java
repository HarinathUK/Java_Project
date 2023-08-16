package com.jsp.Car;

public class BMW extends Car {
	BMW(String color, String model) {
		super(color, model);
	}
	@Override
	public void carDetails() {
		System.out.println("color: " + color);
		System.out.println("model: " + model);
	}
	@Override
	public void start() {
		System.out.println("Use Touchpanal to start BMW car");
	}
	
	@Override
	public void accelarate() {
		System.out.println("press accelarate");
	}
	
	@Override
	public void stop( ) {
		System.out.println("use Touchpanal to stop the BMW car");
		System.out.println("*************************************");

}
}	
