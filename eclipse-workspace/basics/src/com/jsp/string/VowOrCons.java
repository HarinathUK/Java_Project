package com.jsp.string;

import java.util.Scanner;

public class VowOrCons {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scan.next().toLowerCase();
		int vowels =0;
		int consonants = 0;
		
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c>='a'&&c<='z') {
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') vowels++;
				
				else consonants++;	
			}
		}
		System.out.println("Vowels in String: " + vowels);
		System.out.println("Consonants in String: " + consonants);

	}

}
