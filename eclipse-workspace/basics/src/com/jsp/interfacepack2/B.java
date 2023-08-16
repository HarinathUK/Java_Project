package com.jsp.interfacepack2;

public class B implements I {
	@Override
	public void m1() {
		System.out.println("m1() method of class B");
	}
	
	@Override
	public void m2() {
		System.out.println("default method of interface overridden in class B");
	}
}
