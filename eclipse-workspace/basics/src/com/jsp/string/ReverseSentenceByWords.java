package com.jsp.string;

public class ReverseSentenceByWords {

	public static void main(String[] args) {
		String s = "java is easy";
		s = s+" ";
		String temp = "";
		String res = "";
	
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c!=' ') {
				temp += c;
				}
			else {
			for(int j=temp.length()-1; j>=0; j--) {
					char c1 = temp.charAt(j);
					res += c1;
			     	}
			temp = "";
			System.out.println(s.length());
			if(i<s.length()-1)
			res += " ";
				}
			}
		System.out.println(res);
		}

	}

