package com.hari.basics;
import java.util.Scanner;

public class RangeArmstrong {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter First Number: ");
	int start = scan.nextInt();
	System.out.println("Enter Last Number: ");
	int end = scan.nextInt();
	
	
	
	for (int i= start; i<=end; i++) {
		
		if (isArmstrong(i)) 
			System.out.println(i);
	}
			
}

private static boolean isArmstrong(int n) {
	int temp = n;
	int count = 0;
	
	for (; n!=0; n/=10) count++;
	
	n = temp;
	int sum = 0;
	for (; n!=0; n/=10) {
		int rem = n%10;
		sum += pow(rem,count);
	}
	
	if (sum==temp)
		return true;
	
	return false;
}

private static int pow(int x, int y) {
	int power = x;
	for (int i=1; i<y; i++) {
		power *= x; 
	}
	return power;
}
}
