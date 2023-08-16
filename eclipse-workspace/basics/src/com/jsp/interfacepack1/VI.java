package com.jsp.interfacepack1;

public class VI implements Sim {

	@Override
	public void connectCall() {
		System.out.println("Call is connected in VI sim");
	}
	
	@Override
	public void connectData() {
		System.out.println("Data is connected in VI sim");
	}
}
