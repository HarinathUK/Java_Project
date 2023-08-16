package com.oops.upcasting;

class Animal {
	void sound() {}
	void movement() {}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("bow bow");
	}
	
	@Override
	void movement() {
		System.out.println("walk,run,jump");
	}
}

class Snack extends Animal {
	@Override
	void sound() {
		System.out.println("ssshhhhhhhhhh");
	}
	
	@Override
	void movement() {
		System.out.println("nagini dance");
	}
	
}

public class T3 {
	public static void main(String[] args) {
		Animal a;
		a = new Dog();
		a.sound();
		a.movement();
		
		a = new Snack();
		a.sound();
		a.movement();
		
				
	}

}
