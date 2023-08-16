package com.jsp.interfacepack1;

public class Airtel implements Sim {

	@Override
	public void connectCall() {
		System.out.println("Call is connected in Airtel sim");
	}
	
	@Override
	public void connectData() {
		System.out.println("Data is connected in Airtel sim");
	}
}
