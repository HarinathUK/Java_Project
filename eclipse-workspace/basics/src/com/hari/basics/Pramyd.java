package com.hari.basics;

public class Pramyd {

	public static void main(String[] args) {
			int n = 9;
		
		for(int i =1; i<=n/2+1; i++)
			print(i,n);
		
		for(int i=n/2; i>=1; i--)
			print(i,n);
	}

	private static void print(int i, int n) {
		for(int j=1; j<=(n/2+1)-i; j++)
			System.out.print(" ");
	
		for(int j =1; j<=2*i-1; j++) {
			
			System.out.print("*");
		}
		System.out.println();
		

	}

}
