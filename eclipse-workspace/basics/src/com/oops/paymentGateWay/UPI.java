package com.oops.paymentGateWay;

public class UPI implements Payable {

	@Override
	public void pay() {
		System.out.println("Payment successful via UPI");
		
	}

}
