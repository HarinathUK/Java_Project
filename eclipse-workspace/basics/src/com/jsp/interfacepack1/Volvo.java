package com.jsp.interfacepack1;

public class Volvo implements Car {
	
@Override
public void start() {
	System.out.println("Volvo car started by using Key");
}

@Override
public void accelarate() {
	System.out.println("press accelarate to increase speed");
}
@Override
public void stop() {
	System.out.println("Volvo car is stopped by using Key");
	
}

public void bluetooth() {
	System.out.println("Bose bluetooth device is added in Volvo car");
}

public void airBag() {
	System.out.println("3 additional air bag is added in Volvo car");
	System.out.println("*******************************************");
}

}
