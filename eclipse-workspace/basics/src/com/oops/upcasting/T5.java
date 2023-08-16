package com.oops.upcasting;

class A {
	A() { 
		System.out.println("cons of class A");
	}
	A(int a){
		System.out.println("Int cons of class A");
	}
	void m1() {
		System.out.println("m1 of A");
	}
	}
class B extends A {
	B() {
		super(5);
		System.out.println("cons of class B");
	}
	//B(int a){
		//System.out.println("Int cons of class B");
	//}
	void m1() {
		System.out.println("m1 of B");
	}
}

public class T5 {
	public static void main(String[] args) {
		A a = new B();
		a.m1();
	}

}
