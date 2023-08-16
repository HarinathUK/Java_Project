package com.oops.upcasting;

class D {
	static void m1() {
		System.out.println("m1 of D");
	}
}

class E extends D {
	static void m1() {
		System.out.println("m1 of E");
	}
}
public class T4 {
	public static void main(String[] args) {
		D.m1();
		E.m1();
		
//		D d;
//		d = new D();
//		d.m1();
//		d = new E();
//		d.m1();
	}

}
