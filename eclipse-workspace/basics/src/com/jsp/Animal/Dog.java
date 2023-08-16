package com.jsp.Animal;

public class Dog extends Animal {
	
	@Override
	public void sound() {
		System.out.println("bow bow....");
	}
	
	@Override
	public void movement() {
		System.out.println("walk..run..jump..");
		
	}
	
	public void swim() {
		System.out.println("Dog can swim");
		System.out.println("********************");
	}
	
}
