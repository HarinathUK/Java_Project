package com.jsp.string;

public class RepeatCharConvertToInt {

	public static void main(String[] args) {
		String s = "HelloWorld";
		System.out.println(count(s));

	}

	private static String count(String s) {
		s = s.toLowerCase();
		char[] c = s.toCharArray();
		for(int i = 0; i<c.length; i++) 
		{
			int count = 49;
			for(int j = i+1; j<c.length; j++) 
			{
				if(c[i]==c[j])
				{
					count++;
					c[j] = (char) count;
				}
			}
			if(count>49) 
			{
				c[i] = 49;
			}
			
		}
		 return s = new String(c);
	}

}
