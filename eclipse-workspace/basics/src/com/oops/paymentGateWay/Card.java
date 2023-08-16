package com.oops.paymentGateWay;

public class Card implements Payable {
	@Override
	public void pay() {
		System.out.println("Payment successful via Card");
		
	}
}
