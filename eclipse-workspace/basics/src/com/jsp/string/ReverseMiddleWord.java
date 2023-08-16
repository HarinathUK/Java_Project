package com.jsp.string;

public class ReverseMiddleWord {

	public static void main(String[] args) {
		String s = "java is easy";
		s = s+" ";
		String s1 = "";
		int count = 0;
		String temp = "";
		String temp2 ="";
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c!=' ') temp+=c;
			else {
				count++;
				if(count==2)
				{
					for(int j = temp.length()-1; j>=0; j--) {
						char c1 = temp.charAt(j);
						temp2 += c1;
					}
					s1 += temp2;
					
				}
				else {
					s1+=temp;
				}
					if(i<s.length()-1)
					s1+=" ";
					temp = "";
			}
		}
		System.out.println(s1);

	}

}
