package com.hari.methodoverriding;

class Dad
{
	public static void phone() 
	{
		System.out.println("nokia");
	}

}

class Son extends Dad {
	
	public static void phone() 
	{
		System.out.println("samsung");
	}

}



public class Test 
{
	
	public static void main (String [] agrs) 
	{
		
		Son s = new Son();
		s.phone();
		

	}

}
