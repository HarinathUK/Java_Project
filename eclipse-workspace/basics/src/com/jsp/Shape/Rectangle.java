package com.jsp.Shape;

public class Rectangle extends Shape {
	int length;
	int breadth;
	
	Rectangle(String color, int length, int breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
		
	}
	@Override
	public void getData() {
		
		System.out.println("color: " +  color);
		System.out.println("length: " +  length);
		System.out.println("breadth: " +  breadth);
	}
	@Override
	public void calcArea() {
		
		int area = length*breadth;
		System.out.println("Area of rectangle: " + area);
		System.out.println("******************************");
	}
}
