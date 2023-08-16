package com.jsp.bankapp;
import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		System.out.println("Enter the amount: ");
		Scanner scan = new Scanner(System.in);
		double amount = scan.nextDouble();
		Salesman salesman = new Salesman();
		salesman.provideLoanInfo(new Sbi(), amount);
	}

}
