package com.jsp.string;
import java.util.Scanner;
public class Convert {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String s = scan.next();
	String s1 = "";
	for(int i=0; i<(s.length()); i++) {
		char c = s.charAt(i);
		if(c>='A'&&c<='Z') {
			c = (char) (c+32);
		}
		else if (c>='a' && c<='z')
		{
			c = (char) (c-32);
		}
		s1 +=c;
	}
	System.out.println(s1);
}
}
