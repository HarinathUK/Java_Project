package com.jsp.string;

public class SubString {

	public static void main(String[] args) {
		String s = "Harinath";
		
		for(int i =0; i<s.length(); i++) {
			for(int j=i+2; j<=s.length(); j++) {
			String s1  = s.substring(i,j);
			System.out.println(s1);
		}
		}
	}

}
