package com.jsp.string;

public class StringPattern {

	public static void main(String[] args) {
		String s = "Joyson";
		String s1 = "";
		for(int i =0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			s1 += c;
			System.out.println(s1);
		}

	}

}
