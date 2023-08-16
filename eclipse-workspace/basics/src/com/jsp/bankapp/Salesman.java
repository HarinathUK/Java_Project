package com.jsp.bankapp;

public class Salesman {
	public void provideLoanInfo(Bank bank, double amount) {
		double roi = bank.rateOfInterest();
		int roiInPerc = (int) (roi*100);
		System.out.println("rate of interest: " + roiInPerc + "% is gurranted");
		double rateAmount = amount*roi;
		System.out.println(rateAmount + " for " + roiInPerc + "%");
		double grandTotal = rateAmount + amount;
		System.out.println(grandTotal + " to be paid for the amount " + amount + " and for the rate of interest: " + roiInPerc + "%");
		
		
	}
}
