package com.oops.Abstract;
abstract class A {
	static int i;
	
	static {
		i=10;
	}
	
	A() {
		System.out.println("cons of abstract class");
	}
	static void m3( ) {
		System.out.println("static method of abstract class");
	}
	
	 abstract void m1();
	
	final void m2() {
		System.out.println("m2() of A " + i);
	}
}

class B extends A {
	void m1() {
		System.out.println("m1() of B "+ i);
	}
}

public class T1 {
public static void main(String[] args) {
	A a = new B();
	a.m1();
	a.m2();
	A.m3();
}
}
