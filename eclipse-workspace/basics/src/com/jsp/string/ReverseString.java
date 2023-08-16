package com.jsp.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scan.next();
		
		String res = reverseString(s);
		System.out.println("The reverse of the String: " + res);

	}
	public static String reverseString(String s) {
		String temp = "";
		for(int i=s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			 temp+=c;
		}
		return temp;
	}
}
