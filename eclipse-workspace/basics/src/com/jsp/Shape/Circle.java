package com.jsp.Shape;

public class Circle extends Shape {
	int radius;
	
	Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}
	@Override
	public void getData() {
		
		System.out.println("color: " + color);
		System.out.println("radius: " + radius);
	}
	
	@Override
	public void calcArea() {
		double area = Pi*radius*radius;
		System.out.println("Area of circle: " + area);
		System.out.println("******************************");
	}

}
