package com.oops.customers;

public class createCustomer {
	public static void main(String[] args) {

	Flipkart cus1 = new Flipkart("Harinath","Male");
	System.out.println(cus1);
	cus1.purchase();
	cus1.continueForPayment();
}
}