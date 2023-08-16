package com.jsp.Animal;

public class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("meou meou....");
	}
	
	@Override
	public void movement() {
		System.out.println("walk..run..jump..");
		System.out.println("********************");
}
}
