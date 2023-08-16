package com.jsp.interfacepack1;

public class Jio implements Sim {
	
	@Override
	public void connectCall() {
		System.out.println("Call is connected in Jio sim");
	}
	
	@Override
	public void connectData() {
		System.out.println("Data is connected in Jio sim");
	}

}
