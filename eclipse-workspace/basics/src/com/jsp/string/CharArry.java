package com.jsp.string;

public class CharArry {

	public static void main(String[] args) {
		String s = "harinath";
		char[] c  = s.toCharArray(); 
		System.out.println(c.toString());
		for (int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println(s.length());
		System.out.println(c.length);

	}

}
