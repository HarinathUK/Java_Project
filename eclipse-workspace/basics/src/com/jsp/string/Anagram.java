package com.jsp.string;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String1: ");
		String s1 = scan.next();
		System.out.println("Enter String1: ");
		String s2 = scan.next();
		boolean flag = true;
		for(int i=0; i<s1.length(); i++) {
			char c1 = s1.charAt(i);
			if(s2.indexOf(c1)==-1)
				flag = false;
		}
		if(flag) System.out.println("It is a Anagram");
		else System.out.println("It is not a Anagram");
	}

}
