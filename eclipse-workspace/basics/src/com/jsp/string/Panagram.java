package com.jsp.string;

public class Panagram {

	public static void main(String[] args) {
		String s = "a quick brown fox jumps over the lazy dog";
		if(isPanagram(s)) {
			System.out.println("It is a panagram");
		}
		else
			System.out.println("It is not a panagram");

	}
	public static boolean isPanagram(String s) {
		if (s.length()<26) return false;
		for(char c ='a'; c<='z'; c++) {
			if(s.indexOf(c)==-1) return false;
		}
		return true;
	}
}
