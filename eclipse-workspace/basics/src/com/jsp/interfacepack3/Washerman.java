package com.jsp.interfacepack3;

public class Washerman {

	public void wash(Object obj) {
		
		if(obj instanceof Washable)
			System.out.println(obj.getClass().getSimpleName()+ " is washed and clean");
		
		else
			System.out.println(obj.getClass().getSimpleName()+ " is not washable");
	}
}

class Car implements Washable {
	
}

class Truck implements Washable {
	
}

class Bike implements Washable {
	
}

class Mobile{
	
}

class Tv {
	
}



