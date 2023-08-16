package com.oops.upcasting;

class Bike {}

class Pulsor extends Bike {}

class Mechanic1 {
	void service(Bike b ) {
		System.out.println("M1 bike");
	}
	
	void service(Pulsor p) {
		System.out.println("M1 pulsor");
		}
	}

class Mechanic2 extends Mechanic1 {
	void service(Bike b) {
		System.out.println("M2 bike");
	}
	
	void service (Pulsor p) {
		System.out.println("M2 pulsor");
	}
}

public class T1 {
	public static void main(String[] args) {
		Bike bike = new Pulsor();
		Mechanic1 mech = new Mechanic2();
		mech.service(bike);
		
	}

}
