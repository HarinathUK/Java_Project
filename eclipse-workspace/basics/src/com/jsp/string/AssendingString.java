package com.jsp.string;

import java.util.Scanner;

public class AssendingString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scan.next().toLowerCase();
		char[] ch = s.toCharArray();
		
		for(int i=0; i<ch.length-1; i++) 
		{
			for(int j =i+1; j<ch.length; j++) 
			{
			if(ch[i]>ch[j]) {
				char t = ch[i];
				ch[i] = ch[j];
				ch[j] = t;
			}
			}	
			}
		System.out.println(ch);
		}

	}

