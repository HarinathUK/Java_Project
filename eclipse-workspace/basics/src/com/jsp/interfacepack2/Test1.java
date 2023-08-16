package com.jsp.interfacepack2;

public class Test1 {
public static void main(String[] args) {
	Car c;
	c = new Audi();
	c.start();
	c.accelarate();
	c.stop();
	Car.carGuide();
	
	c = new BMW();
	c.start();
	c.accelarate();
	c.stop();
	Car.carGuide();
	
	c = new Nexon();
	c.start();
	c.accelarate();
	c.stop();
	Car.carGuide();
	
	c = new Volvo();
	c.start();
	c.accelarate();
	c.stop();
	c.gps();
	Car.carGuide();
	
}
}
