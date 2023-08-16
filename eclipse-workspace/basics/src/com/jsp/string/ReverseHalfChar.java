package com.jsp.string;

public class ReverseHalfChar {

	public static void main(String[] args) {
		String s = "knowledge";
		String[] s1 = s.split("l");
		String s2 = "l"+s1[1]+s1[0];
		System.out.println(s2);
		
	}

}
