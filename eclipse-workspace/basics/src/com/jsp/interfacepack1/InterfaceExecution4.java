package com.jsp.interfacepack1;

public class InterfaceExecution4 {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		driver.drive(new Audi());
		driver.accessBluetooth(new Audi());
		driver.accessAirBag(new Audi());
		
		driver.drive(new BMW());
		driver.accessBluetooth(new BMW());
		driver.accessAirBag(new BMW());
		
		driver.drive(new Volvo());
		driver.accessBluetooth(new Volvo());
		driver.accessAirBag(new Volvo());


	}

}
