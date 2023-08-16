package com.jsp.interfacepack1;

public class Driver {
	
	public void drive(Car car) {
		car.start();
		car.accelarate();
		car.stop();
		
	}
	
	public void accessBluetooth(Car car) {
		if (car instanceof Audi)
			((Audi) car).bluetooth();
		
		if (car instanceof BMW)
			((BMW) car).bluetooth();
		
		if (car instanceof Volvo)
			((Volvo) car).bluetooth();
	}
	
	public void accessAirBag(Car car) {
		if(car instanceof Audi)
			((Audi) car).airBag();
		
		if (car instanceof BMW)
			((BMW) car).airBag();
		
		if (car instanceof Volvo)
			((Volvo) car).airBag();
	}
		
}
