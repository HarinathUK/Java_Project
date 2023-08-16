package com.hari.basics;

public class TryCatch {
	public static void main(String[] args) {
		String s = "123";
		int num=0;
		
		try { 
			num = Integer.parseInt(s);
			System.out.println(num);
		}
		catch(NumberFormatException e) {
			System.out.println("It is not a valid integer");
			
		}
		System.out.println(num);
		
		
}

}
