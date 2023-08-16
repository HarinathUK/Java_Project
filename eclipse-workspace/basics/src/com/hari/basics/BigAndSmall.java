package com.hari.basics;

public class BigAndSmall {

	public static void main(String[] args) {
		int n = 2345;
		int big =0;
		int small =9;
		
		for (; n!=0; n/=10)
		{
			int rem = n%10;
			if(rem>big) big=rem;
			
			if(rem<small) small=rem;
		}
		
		System.out.println("Big: " + big);
		System.out.println("Small: " + small);

	}

}
