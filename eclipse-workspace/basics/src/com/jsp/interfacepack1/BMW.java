package com.jsp.interfacepack1;

public class BMW implements Car {
	
@Override
public void start() {
	System.out.println("BMW car started by using Touchpanel");
}

@Override
public void accelarate() {
	System.out.println("press accelarate to increase speed");
}
@Override
public void stop() {
	System.out.println("Audi car is stopped by using Touchpanel");
	
} 

public void bluetooth() {
	System.out.println("Jbl bluetooth device is added in BMW car");
}

public void airBag() {
	System.out.println("1 additional air bag is added in BMW car");
	System.out.println("*******************************************");
}

}
