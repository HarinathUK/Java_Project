package com.jsp.interfacepack3;
import java.util.Scanner;

public class VegCasting {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("Veg: ");
	String vegName = scan.nextLine();
	
	Shopkeeper sk = new Shopkeeper();
	Vegetable veg =sk.sell(vegName);
	
	if (veg instanceof Carrot)
	{
		System.out.print(veg.getClass().getSimpleName()+ " ");
		veg.washVeg();
		((Carrot)veg).makeHalwa();
	}
	
	if (veg instanceof Potato) {
		System.out.print(veg.getClass().getSimpleName()+ " ");
		veg.washVeg();
		((Potato)veg).makeFries();
	}
}	
}
