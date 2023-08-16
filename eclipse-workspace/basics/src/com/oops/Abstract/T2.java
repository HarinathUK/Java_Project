package com.oops.Abstract;
abstract class Car {
	static String color = "white";
	abstract void service();
}

class BMW extends Car {
	void service() {
		System.out.println("BMW serviced " + color);
	}
}

class Audi extends Car {
	String color = "Blue";
	void service() {
		System.out.println("Audi serviced " + color);
	}
}
public class T2 {
public static void main(String[] args) {
	Car c1 = new BMW();
	c1.service();
	Car c2 = new Audi();
	c2.service();
}
}
