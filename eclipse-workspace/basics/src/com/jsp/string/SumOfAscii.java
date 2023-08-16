package com.jsp.string;

public class SumOfAscii {

	public static void main(String[] args) {
		String s = "Harinath";
		int ascii = 0;
		
		for(int i =0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			ascii += c;
		}
		System.out.println(ascii);
	}

}
