package com.jsp.interfacepack1;

public class AC implements Switch {
	
	@Override
	public void on() {
		System.out.println("AC is on");
	}
	
	@Override
	public void off() {
		System.out.println("AC is off");
	}

}
