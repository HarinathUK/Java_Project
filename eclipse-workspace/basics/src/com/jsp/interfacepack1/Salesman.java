package com.jsp.interfacepack1;

public class Salesman {
	public static void provideInfo(Bank b , double amt) {
		double roi = b.roi();
		b.viewBal();
		b.deposit();
		b.withdraw();
		
		int roiInPerc = (int) (roi*100);
		System.out.println("rate of interest: " + roiInPerc + " % is Gurranted");
		double rateAmount = amt*roi;
		System.out.println(rateAmount + "  for " + roiInPerc + " %");
		double grandTotal = rateAmount+amt;
		System.out.println(grandTotal + " is the total amount will get at the end of the year");
		System.out.println("*******************************************************************");
		
		
	}

}
