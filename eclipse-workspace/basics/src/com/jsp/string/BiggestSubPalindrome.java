package com.jsp.string;

public class BiggestSubPalindrome {

	public static void main(String[] args) {
		String s = "malayalam";
		String sub = "";
		String bigSub = "";
		for(int i=0; i<s.length(); i++) 
		{
			char c1 = s.charAt(i);
			for(int j = i+2; j<s.length(); j++)
			{
				char c2 = s.charAt(j);
				sub = s.substring(i, j);
				if(isPalindrome(sub)) {
					if(sub.length()>bigSub.length())
					bigSub = sub;
				}
			}
		}
		System.out.println(bigSub);

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
