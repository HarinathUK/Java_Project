package com.jsp.interfacepack1;
import java.util.Scanner;

public class InterfaceExecution3 {
	public static void main(String[] args) {
		
		System.out.println("Enter the amount");
		double amt = new Scanner(System.in).nextDouble();
		
		Salesman.provideInfo(new Hdfc() , amt);
		Salesman.provideInfo(new Sbi(), amt);
		Salesman.provideInfo(new Icici(), amt);
	}

}
