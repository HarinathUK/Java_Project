package com.jsp.string;
import java.util.Scanner;
public class CurrencyFormat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a amount");
		String s = scan.next();
		int count = 0;
		for(int i = s.length()-1; i>=0; i--)
		{
			count++;
			if(count>1 && count%2!=0 && count< s.length()) {
				char c1;
			c1 = s.charAt(count);
			c1 += ',';
			}
				
		}
		System.out.println("India: "+s);
		System.out.println("US: "+s);
		System.out.println("China: "+s);
	}

}
