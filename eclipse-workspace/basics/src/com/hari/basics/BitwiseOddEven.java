package com.hari.basics;

public class BitwiseOddEven {
public static void main(String[] args) {
	int n = 32;
	if ((n & 1) == 0) System.out.println(n + " is even number");

	else System.out.println(n + " is odd number");
}
}
