package com.jsp.string;

public class MinOccuredWordCount {

	public static void main(String[] args) {
		String s = "Happy happy happy happy happy birthday Birthday";
		String[] s1 = s.split(" ");
		int min = s1.length;
		String temp = ""; 
		for(int i =0; i<s1.length; i++)
		{
			int count = 1;
			
			for(int j =0; j<s1.length; j++)
			{
				if(s1[i].equalsIgnoreCase(s1[j]) && i!=j )
				{
					count++;
				}
			}
			if(min>count)
			{
				temp = s1[i];
				min = count;
			}
		}
		System.out.println(temp+":"+min);


	}

}
