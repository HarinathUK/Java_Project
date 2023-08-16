package com.jsp.Animal;

public class Test {
	public static void main(String[] args) {
	
	Animal a = new Dog();
	a.drink();
	a.eat();
	a.sound();
	a.movement();
		
	Dog d = new Pug();
	d.drink();
	d.eat();
	d.sound();
	d.movement();
	d.swim();

	Animal a1 = new Dog();
	a1.drink();
	a1.eat();
	a1.sound();
	a1.movement();
	
	Dog d1 = (Dog)a1;
	d1.drink();
	d1.eat();
	d1.sound();
	d1.movement();
	d1.swim();
	
	Pug p = (Pug)d1;
	p.drink();
	p.eat();
	p.sound();
	p.movement();
	p.swim();
	p.play();
	
}
}