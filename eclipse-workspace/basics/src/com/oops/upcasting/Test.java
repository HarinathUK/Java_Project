package com.oops.upcasting;

class E1 {
	E1() {
		System.out.println("cons of E1");
	}
	public void m1() {
		System.out.println("m1 method of E1");
	}
}

class F extends E1 {
	F() {
		System.out.println("cons of F");
	}
	public void m2() {
		System.out.println("m2 method of F");
	}
}

class G extends E1 {
	G() {
		System.out.println("cons of G");
	}
	public void m3() {
		System.out.println("m3 method of G");
	}
}

public class Test {
	public static void main(String[] args) {
		E1 a = new G();
		a.m1();
		new F();
		
	}

}
