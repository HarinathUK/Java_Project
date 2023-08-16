package com.hari.methodhiding;

public class B extends A{
	@Override
	void m1() {
		System.out.println("m1 of B");
	}
	
	// method hiding
	static void m2() {
		System.out.println("m2 of B");
	}
}
