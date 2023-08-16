package com.hari.basics;

public class fibonacci_2 {

	public static void main(String[] args) {
		int a =0;
		int b =1;
		int fibonacci = 0;
		while(fibonacci<100)
		{
			fibonacci = a+b;
			if(fibonacci<100) {
			a = b;
			b = fibonacci;
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(fibonacci);
		
	}

}
