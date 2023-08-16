package com.jsp.string;
import java.util.Scanner;
public class FindVowel {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String s = scan.next().toUpperCase();
	int count = 0;
	
	for(int i=0; i<(s.length()); i++) {
		if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			count++;
	}
	System.out.println(count);
}
}
