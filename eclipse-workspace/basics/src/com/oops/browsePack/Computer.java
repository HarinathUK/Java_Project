package com.oops.browsePack;
import java.util.Scanner;

public class Computer {

	public static Browser selectPurpose() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Select Purpose\n");
		System.out.println("1.For private websites\n" + "2.For general information\n" + "3.For government official purpose");
		int purpose = scan.nextInt();
		
		if (purpose == 1) return new Chrome();
		if (purpose == 2) return new Safari();
		if (purpose == 3) return new Mozila();
		
		System.out.println("Invalid selection/no purpose slected");
		return null;
	}

}
