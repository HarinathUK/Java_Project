package com.jsp.string;
import java.util.Scanner;
public class ReplaceChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter char 1: ");
		char c1 = scan.next().charAt(0);
		System.out.println("Enter char 2: ");
		char c2 = scan.next().charAt(0);
		String s = "Vamshika";
		String s1 = "";
		
		for(int i =0; i<s.length(); i++) 
		{
			char c = s.charAt(i);
			if(c==c1)
			{
				c = c2;
			}
			s1 += c;
		}
		System.out.println(s1);
	}

}
