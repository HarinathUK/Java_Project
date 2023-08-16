package com.hari.basics;

class Circle{
	int r;
	final static double pi = 3.14;
	
	Circle(int r){
		this.r =r;
	}
	
	public void findArea(int r) {
		double area = (pi*this.r * this.r);
		System.out.println("Area of circle is: " + area);
	}
	
	public void findCircum(int r) {
		double circum =  2*pi*this.r;
		System.out.println("Circumstance of circle is: " + circum);
	}
}



class Test {

	public static void main(String[] args) {
		final Circle c1 = new Circle(7);
		c1.findArea(7);
		c1.findCircum(7);
		
	}

}
