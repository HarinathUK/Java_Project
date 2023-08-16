package com.jsp.string;

public class ReverseByWords2 {

	public static void main(String[] args) {
		String s = "All for sport";
		s = " "+s;
		char[] c = s.toCharArray();
		String s1 = "";
		String temp = "";
		for(int i =c.length-1; i>=0; i--)
		{
			if(c[i]!=' ')
				temp+=c[i];
			else
			{
				char[] c1 = temp.toCharArray();
				for(int j = c1.length-1; j>=0; j--)
					s1+=c1[j];
				if(i>0)
				s1 += " ";
				temp = "";
			}
		}
		System.out.println(s1);

	}

}
