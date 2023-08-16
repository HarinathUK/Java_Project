package com.hari.basics;

public class Fibonacci {

	public static void main(String[] args) {
		long a = 0L;
		long b = 1L;
		System.out.println(a);
		System.out.println(b);
		long c = 0L;
		
		for (int i =1; i<=100; i++) {
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
			
		}
	}

}
