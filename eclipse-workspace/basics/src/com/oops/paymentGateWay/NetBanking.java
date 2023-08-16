package com.oops.paymentGateWay;

public class NetBanking implements Payable {
	@Override
	public void pay() {
		System.out.println("Payment successful via NetBanking");
		
	}
}
