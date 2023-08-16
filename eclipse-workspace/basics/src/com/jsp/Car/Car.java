package com.jsp.Car;

abstract public class Car {
	
	String color;
	String model;
	
	Car(String color, String model) {
		this.color = color;
		this.model = model;
	}
	
	abstract public void carDetails();
	abstract public void start();
	abstract public void accelarate();
	abstract public void stop();
}
