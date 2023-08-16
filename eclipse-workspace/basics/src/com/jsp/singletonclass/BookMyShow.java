package com.jsp.singletonclass;

public class BookMyShow {

	public static void main(String[] args) {
		BookingApp cus1 = new BookingApp();
		cus1.bookTickets();
		BookingApp cus2 = new BookingApp();
		cus2.bookTickets();
		BookingApp cus3 = new BookingApp();
		cus3.bookTickets();

	}

}
