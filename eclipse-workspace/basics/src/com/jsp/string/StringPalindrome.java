package com.jsp.string;

public class StringPalindrome {

	public static void main(String[] args) {
		String s = "malayalam";
		if(isPalindrome(s)) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
	}

	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}
