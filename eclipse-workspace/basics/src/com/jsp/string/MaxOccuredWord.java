package com.jsp.string;

public class MaxOccuredWord {

	public static void main(String[] args) {
		String s = "Happy Happy happy happy bridthday";
		String[] s1 = s.split(" ");
		int max = 0;
		String temp = ""; 
		for(int i =0; i<s1.length; i++)
		{
			int count = 1;
			
			for(int j =i+1; j<s1.length; j++)
			{
				if(s1[i].equalsIgnoreCase(s1[j]))
				{
					count++;
				}
			}
			if(max<count)
			{
				temp = s1[i];
				max = count;
			}
		}
		System.out.println(temp+":"+max);

	}

}
