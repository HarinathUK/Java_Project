package com.hari.methodhiding;

public class Test {
public static void main(String[] args) {
	
	A a = new B();
	a.m1(); // overridden
	a.m2(); // method hiding
	B.m2(); // m2() method of class B calling
}
}
