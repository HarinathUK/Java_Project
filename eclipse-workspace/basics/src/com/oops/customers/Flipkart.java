package com.oops.customers;
import com.oops.paymentGateWay.*;

public class Flipkart {
	static int count;
	int fid;
	String name;
	String gender;
	
	static 
	{
		count = 1000;
	}
	
	{
		count++;
		fid = count;
	}
	
	Flipkart (String name, String gender) 
	{
		this.name = name;
		this.gender = gender;
	}
	
	public void purchase() {
		System.out.println("purchase logic has to be written here");
	}
	
	public void continueForPayment() {
		Payable payOption = PhonePe.givePaymentOption();
		payOption.pay();
	}
	
	@Override
	public String toString() {
		return "CID: " + fid  + " Name: " + name  + " Gender: " + gender;
	}
}
