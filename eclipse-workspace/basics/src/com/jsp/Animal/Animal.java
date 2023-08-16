package com.jsp.Animal;

abstract public class Animal {
	public void eat() {
		System.out.println("Eating....");
	}
	public void drink() {
		System.out.println("Drinking....");
	}
	
	abstract public void sound();
	abstract public void movement();
}
