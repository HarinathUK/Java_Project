package com.jsp.interfacepack3;

public class Shopkeeper {
	public Vegetable sell(String vegName) {
		
	
		if(vegName.equalsIgnoreCase("Carrot"))
			return new Carrot();
		
		if(vegName.equalsIgnoreCase("Potato"))
			return new Potato();
		
		System.out.println(vegName + " is not available");
		return null;
	}	
}
