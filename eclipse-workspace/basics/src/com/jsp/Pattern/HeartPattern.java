package com.jsp.Pattern;

public class HeartPattern {
	public static void main(String[] args) {
		int n =6;
		
		for (int i=0; i<n; i++) {
			
			for (int j=0; j<=n; j++) {
				if ((i==0 && j%3!=0) || (i==1 && j%3==0) || (i-j==2) || (i+j==8)) 
					System.out.print(". ");
				
				else 
					if(i==2 && j==n/2) System.out.print("H ");
					else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
