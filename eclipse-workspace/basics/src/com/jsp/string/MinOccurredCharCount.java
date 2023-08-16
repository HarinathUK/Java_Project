package com.jsp.string;

public class MinOccurredCharCount {

	public static void main(String[] args) {
		String s = "aaaabbbcctccddd";
		
		int miniCount = s.length();
		char mini = ' ';
		
		for(int i = 0; i<s.length(); i++) {
			char c1 = s.charAt(i);
			int count = 1;
			for(int j = 0; j<s.length(); j++) {
				char c2 = s.charAt(j);
				if(i!=j && c1 == c2) {
					count++;
				}
			}
			if(count<miniCount)
			{
				miniCount = count;
				mini = c1;
			}

	}
		System.out.println(mini+ ":" + miniCount);

}
}