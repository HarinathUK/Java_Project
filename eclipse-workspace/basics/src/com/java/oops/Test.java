package com.java.oops;
class A1
{
	private int i;
	{
		int i =10;
	}
	public void accessI() {
		System.out.println("i: "+ i);
	}
}

class B1 extends A1
{
	public void m1()
	{
		accessI();
	}
	
}
public class Test {
public static void main(String[] args) {
	System.out.println("hi");
	A1 a = new A1(); 
	a.accessI();
	B1 b = new B1();
	b.accessI();
	b.m1();
}
}
