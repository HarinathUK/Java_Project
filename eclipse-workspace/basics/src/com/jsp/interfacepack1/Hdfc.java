package com.jsp.interfacepack1;

public class Hdfc implements Bank {
	 
	@Override
	public void viewBal() {
		System.out.println("Bal is viewed in Hdfc bank");
	}
	
	@Override
	public void deposit() {
		System.out.println("Deposited is successfull in Hdfc bank");
	}
	
	@Override
	public void withdraw() {
		System.out.println("Withdraw is successfull in Hdfc bank");
	}
	
	@Override
	public double roi() {
		return 0.08;
	}
}
