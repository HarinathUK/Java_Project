package com.jsp.interfacepack2;

public interface Car {
	void start();
	void accelarate();
	void stop();
	default void gps() {
		
	}
	
	static void carGuide() {
		System.out.println("Wear your seat belts");
		System.out.println("*************************************");
	}
}
