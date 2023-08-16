package com.jsp.interfacepack1;

public class Fan implements Switch {
	
	@Override
	public void on() {
		System.out.println("Fan is on");
	}
	
	@Override
	public void off() {
		System.out.println("Fan is off");
	}
}
