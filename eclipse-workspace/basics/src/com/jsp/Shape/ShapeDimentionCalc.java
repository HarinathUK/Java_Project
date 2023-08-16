package com.jsp.Shape;

public class ShapeDimentionCalc {

	public static void main(String[] args) {
		Shape s;
		s = new Circle("Blue", 6);
		s.getData();
		s.calcArea();
		
		s = new Rectangle("Red", 8, 5);
		s.getData();
		s.calcArea();

	}

}
