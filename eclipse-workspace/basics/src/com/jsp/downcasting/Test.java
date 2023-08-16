package com.jsp.downcasting;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new B();  // upcasting
		a.m1();
		a.m2();
		
		
		B b = (B) a;  //downcasting
		b.m1();
		b.m2();
		b.m3();
	}

}
