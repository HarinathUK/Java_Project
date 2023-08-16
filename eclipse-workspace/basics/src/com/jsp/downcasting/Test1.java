package com.jsp.downcasting;

public class Test1 {
public static void main(String[] args) {
	Bank bank1 = new Icici();
	bank1.rateOfInterest();
	
	Icici icici = (Icici) bank1;    // downcasting to access specific property
	icici.carLoan();
	
	Bank bank2 = new State();
	bank2.rateOfInterest();
	
	((State) bank2).homeLoan();   // another way of downcasting
	
	Object obj = new Icici();
	System.out.println(obj instanceof Object);
	System.out.println(obj instanceof Icici);
	System.out.println(obj instanceof Bank);
	
	Bank b = (Bank) obj;
	b.rateOfInterest();    // Accessing another parent methods using downcasting
	
}
}
