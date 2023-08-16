package com.jsp.string;

public class NumOfPalindromeWords {

	public static void main(String[] args) {
		String s = "Madam Sir Madam";
		s = s.toLowerCase();
		s = s+" ";
		String temp = "";
		int count = 0;
		
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c != ' ') {
				temp+=c;
			}
			else {
				if(isPalindrome(temp)) {
					count++;
				}
				temp = "";
			}
		}
		System.out.println("Number of Palindrome words in "+s+":"+count);
	}

	private static boolean isPalindrome(String s) {
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

