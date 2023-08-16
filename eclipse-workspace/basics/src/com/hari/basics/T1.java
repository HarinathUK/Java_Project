package com.hari.basics;

public class T1 {
public static void main(String[] args) {
	int n = 5;
	
	for (int i =1; i<=n; i++) {
		int k = n-i+1;
		for (int j=1; j<=i-1; j++)
			System.out.print(" ");
		for (int j=1; j<=n+1-i; j++) 
			System.out.print(k);
		System.out.println();
	}
}
}
