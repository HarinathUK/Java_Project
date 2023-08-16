package com.jsp.Shape;

abstract public class Shape {
	double Pi = 3.14;
	String color;
	
	Shape(String color) {
		this.color = color;
	}

	abstract public void getData();
	abstract public void calcArea();
}
