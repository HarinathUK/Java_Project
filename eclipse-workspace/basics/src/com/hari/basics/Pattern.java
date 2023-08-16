package com.hari.basics;

public class Pattern {
	public static void main(String[] args) {
		int n = 5;
		
		for (int i =1; i<=n; i++) {
			int k = i;
			for (int j=1; j<=5; j++) {
				if (i==j || j==n+1-i)
				System.out.print(k);
				else System.out.print(" ");
			}
			System.out.println();
				
			}
}
}
