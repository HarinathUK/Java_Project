package com.jsp.string;

public class ReplaceCharByIndex {

	public static void main(String[] args) {
		String s = "Harinath";
		int index = 3; 
		String s1 = "";
		String temp = "";
		for(int i =0; i<s.length(); i++) 
		{
			char c = s.charAt(i);
			if(i>index) s1 += c;
			else
				temp += c;
		}
		System.out.println(s1+temp);
		

	}

}
