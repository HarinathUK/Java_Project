package com.jsp.string;

import java.util.Scanner;

public class VersionCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String1: ");
		String s1 = scan.next();
		System.out.println("Enter String2: ");
		String s2 = scan.next();
		if(s1.equals(s2)) {
			System.out.println("equals");
			return;
		}
		s1 = s1.toLowerCase();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
	
		for(int i=0; i<s1.length(); i++) {
			
			if(c1[i]>='1'&&c1[i]<='9' && c2[i]>='1'&&c2[i]<='9' || c1[i]>='a'&&c1[i]<='z') {
				if(c1[i]>c2[i]) {
					System.out.println("downgraded");
					return;
				}
				else if(c1[i]<c2[i]) {
					System.out.println("upgraded");
					return;
				}
		}
			
			
	}

	}

}
