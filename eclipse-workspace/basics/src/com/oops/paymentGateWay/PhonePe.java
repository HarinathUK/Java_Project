package com.oops.paymentGateWay;
import java.util.Scanner;

public class PhonePe {


	public static Payable givePaymentOption() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Select Payment Option\n");
		System.out.println("1.UPI\n" + "2.NetBanking\n" + "3.Card");
		int choice = scan.nextInt();
		
		if (choice==1) return new UPI();
		if (choice==2) return new NetBanking();
		if (choice==3) return new Card();
		
		System.out.println("Inavlid selection/not selected any payment option");
		return null;
	}
}
