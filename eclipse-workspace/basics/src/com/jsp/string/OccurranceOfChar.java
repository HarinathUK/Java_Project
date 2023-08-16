package com.jsp.string;

public class OccurranceOfChar {

	public static void main(String[] args) {
		String s = "Harinath";
		s = s.toLowerCase();
		char[] c = s.toCharArray();
		
		for(int i =0; i<s.length(); i++)
		{
			int count = 1;
			for(int j = i+1; j<s.length(); j++)
			{
				
				if(c[i]==c[j])
				{
					count++;
					c[j] = ' ';
				}
			}
			if(c[i] != ' ')
			System.out.println(c[i]+ ":" + count);
		}

	}

}
