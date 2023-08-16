package com.jsp.Car;

public class SelectCar {
	public static void main(String[] args) {
//	Driver.drive(new Audi("blue" ,"suv"));
//	Driver.drive(new BMW("red" ,"sadan"));
//	Driver.drive(new Nexon("black" , "suv"));
		Driver driver = new Driver();
		driver.drive(new Audi("blue" ,"suv"));
		driver.drive(new Audi("red" ,"sadan"));
		driver.drive(new Audi("white" ,"suv"));
	}

}