package com.jsp.string;

import java.util.Scanner;

public class MissingCharactor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scan.next().toLowerCase();
		
		for(char c = 'a'; c<='z'; c++) {
				if(s.indexOf(c)==-1) {
					System.out.println(c);
				}
		}
		

	}

}
