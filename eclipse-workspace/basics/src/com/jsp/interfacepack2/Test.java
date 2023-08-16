package com.jsp.interfacepack2;

public class Test {
public static void main(String[] args) {
	I i;
	i = new A();
	i.m1();
	
	i = new B();
	i.m1();
	i.m2();
	
	I.m3();
}
}
