package com.jsp.string;

public class NonRepeatingChar {

	public static void main(String[] args) {
		String s = "aabddfddc";
		String s1 = "";
		for(int i =0; i<s.length(); i++) {
			char c1 = s.charAt(i);
			boolean flag = true;
			for(int j =0; j<s.length(); j++) {
				char c2 = s.charAt(j);
				if(i!=j && c1 == c2) {
				flag = false;
				break;
				}
				
			}
			if(flag) s1+=c1;
			
		}
		System.out.println(s1);

	}

}
