package com.jsp.string;

public class PrintInputCharAndCount {

	public static void main(String[] args) {
		String s = "ababcdcdefeghiji";
		String inp = "ab";
		int count = 0;
		
		for(int i = 0; i<s.length(); i+=2)
		{
			if((s.charAt(i)+""+s.charAt(i+1)+"").equals(inp)) 
				{
				count++;
				}
				
		}
		System.out.println(inp+":"+count);
		
	}

}
