package com.jsp.string;
import java.util.Scanner;

import com.hari.basics.Pattern;
public class IntToString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		String s = scan.next();
		
		Integer n = Integer.valueOf(s);
		int a = 5;
		
		
		
//		if(s.length()==1)
//			System.out.println("one");
//		if(s.length()==2)
//			System.out.println("ten");
//		if(s.length()==3)
//			System.out.println("hundred");
//		if(s.length()==4)
//			System.out.println("thousand");
//		if(s.length()==5)
//			System.out.println("lacks");
//		if(s.length()==6)
//			System.out.println("crore");
//		String ones = "";
//		String tens = "";
//		String hundreds = "";
//		String thousands = "";
//		String lacks = "";
//		String crore = "";
//		String words = "";
//		int count = 0;
//		for(int i=s.length()-1; i>=0; i--) {
//			char c = s.charAt(i);
//			if(i==s.length()-1) {
//				if(c==0) ones = "";
//				if(c==1) ones = "one";
//				if(c==2) ones = "two";
//				if(c==3) ones = "three";
//				if(c==4) ones = "four";
//				if(c==5) ones = "five";
//				if(c==6) ones = "six";
//				if(c==7) ones = "seven";
//				if(c==8) ones = "eight";
//				if(c==9) ones = "nine";
//			}
//			if (i==s.length()-2) {
//				if(c==0) ones = "";
//				if(c==1 && words==one) ones = "eleven";
//				if(c==2 && words==two) ones = "twelve";
//				if(c==1 && words==one) ones = "thirteen";
//				if(c==1 && words==one) ones = "fourteen";
//				if(c==1 && words==one) ones = "fifteen";
//				if(c==1 && words==one) ones = "sixteen";
//				if(c==1 && words==one) ones = "seventeen";
//				if(c==1 && words==one) ones = "eighteen";
//				if(c==1 && words==one) ones = "nineteen";
//				if(c==1 && words==one) ones = "twenty";
//				if(c==2 && words==one) ones = "twenty+words";
//				if(c==3) ones = "three";
//				if(c==4) ones = "four";
//				if(c==5) ones = "five";
//				if(c==6) ones = "six";
//				if(c==7) ones = "seven";
//				if(c==8) ones = "eight";
//				if(c==9) ones = "nine";
//			}
//			}
//			words += ones;
//		}

	}

}
