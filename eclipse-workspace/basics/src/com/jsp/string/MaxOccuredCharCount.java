package com.jsp.string;

public class MaxOccuredCharCount {
	public static void main(String[] args) {
	String s = "java is easybhhhhh";
	
	int maxCount = 0;
	char max = ' ';
	
	for(int i = 0; i<s.length(); i++) {
		char c1 = s.charAt(i);
		int count = 1;
		for(int j = i+1; j<s.length(); j++) {
			char c2 = s.charAt(j);
			if(c1 == c2) {
				count++;
			}
		}
		
		if(count>=maxCount) {
			maxCount = count;
			max = c1;
		}
	}
	System.out.println(max+":"+maxCount);
	System.out.println(20 << 2);
}
}