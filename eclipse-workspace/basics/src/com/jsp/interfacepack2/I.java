package com.jsp.interfacepack2;

public interface I {
	void m1();
	
	default void m2() {
		System.out.println("Default method of interface");
	}
	
	static void m3() {
		System.out.println("static method of interface");
	}
}

