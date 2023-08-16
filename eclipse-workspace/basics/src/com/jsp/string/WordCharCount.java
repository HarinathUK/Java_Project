package com.jsp.string;

public class WordCharCount {

	public static void main(String[] args) {
		String s = "java is easy";
		s = s+" ";
		int count = 0;
		String s1 = "";
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c!= ' ') {
				count++;
				s1 +=c;
			}
			else {
				System.out.println(s1+ ": " +count);
				s1="";
				count = 0;
			}
		}

	}

}
