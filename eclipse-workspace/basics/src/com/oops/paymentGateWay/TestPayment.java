package com.oops.paymentGateWay;

public class TestPayment {
public static void main(String[] args) {
	Payable payOption = PhonePe.givePaymentOption();
	payOption.pay();
	
}
}
