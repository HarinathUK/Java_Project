package com.jsp.string;

public class ReverseByWordUsingSplit {

	public static void main(String[] args) {
		String s = "i love python";
		String[] s1 = s.split(" ");
		
		for(int i =0; i<s1.length; i++)
		{
			s1[2] = "java";
			System.out.print(s1[i]+ " ");
		}

	}

}
