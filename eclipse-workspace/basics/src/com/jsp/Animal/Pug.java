package com.jsp.Animal;

public class Pug extends Dog {
	@Override
	public void sound() {
		System.out.println("bov bov");
	}
	
	@Override
	public void movement() {
		System.out.println("walk..run..jump..dance");
		
	}
	@Override
	public void swim() {
		System.out.println("Pug can swim");
		
	}
	
	public void play() {
		System.out.println("Playing with kids");
		System.out.println("********************");
	}
	
}

