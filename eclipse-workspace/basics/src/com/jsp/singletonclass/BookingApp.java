package com.jsp.singletonclass;

import java.util.Scanner;

public class BookingApp {
public void bookTickets() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Tickets? ");
	int numTickets = scan.nextInt();
	
	Theater theater = Theater.getInstance();
	theater.reserveSeats(numTickets);
}
}
