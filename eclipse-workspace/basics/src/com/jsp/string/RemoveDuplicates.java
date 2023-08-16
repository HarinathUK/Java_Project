package com.jsp.string;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scan.next();
		String temp ="";
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(temp.indexOf(c)==-1) temp += c;
		}
		System.out.println(temp);
	}

}
