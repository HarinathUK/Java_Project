package com.hari.basics;

public class AlternatePrime {

	public static void main(String[] args) {
		int start = 0;
		int end = 50;
		int count = 1;
		for (int i =start; i <= end; i++) {
			if (isPrime(i)) {
				count++;
				if (count%2 == 0) 
					System.out.println(i);
			}
		}

	}

	private static boolean isPrime(int i) {
		
		if (i<=1)
			return false;
		
		for(int j =2; j<=i/2; j++) {
			if (i%j==0)
				return false;
		}
		return true;
	}
	
	

}
