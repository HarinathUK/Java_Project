package com.java.oops;
class C1{
	protected void m1( ) {
		System.out.println("m1 is called");
	}
}

class D extends C1 {
	protected void m2( ) {
		System.out.println("m2 is called");
	}
}

public class Test1 {
public static void main(String[] args) {
	D d = new D();
	d.m2();
	d.m1();
}
}
