package com.jsp.string;

public class StringInItCap {

	public static void main(String[] args) {
		String s = "ramana kumar goud";
		s = s.toLowerCase();
		String s1 = "";
		char c1 = s.charAt(0);
		c1 = (char) (c1-32);
		s1 += c1;
		for(int i =1; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c==' ') {
				char c2 = s.charAt(i+1);
				c2 = (char) (c2-32);
				s1+=" "+c2;
				i++;
			}
			else s1+=c;
		}
		System.out.println(s1);
	}

}
