package com.hari.basics;

public class P1 {
	public static void main(String[] args) {
		P2 p2 = new P2(1,"apple");
		P2 p3 = new P2(1,"apple");
		Practice p4 = new Practice(1,"hari",28,p2);
		Practice p5 = new Practice(1,"hari",27,p3);
		
		System.out.println(p4.equals(p5));
	}
}