package com.jsp.string;
import java.util.Scanner;
public class SumNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scan.next();
		
		int res = sumOfNum(s);
		System.out.println("Sum of number in Alpha numeric String= " + res);

	}

	private static int sumOfNum(String s) {
		int sum = 0;
		for(int i =0; i<(s.length()); i++) {
			char c = s.charAt(i);
			if(c>='0' && c<='9') {
				sum += c-48;
			}
		}
		
		return sum;
	}

}
