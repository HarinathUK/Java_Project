package com.jsp.singletonclass;

public class Theater {
	int seats = 50;
	private static Theater t = null;
	
	private Theater() {
		
	}
	
	public static Theater getInstance() {
		if (t==null) t = new Theater();
		return t;
	}

public void reserveSeats(int numSeats) {
	if (numSeats>seats)
	{
		System.out.println(numSeats + " are not available");
		System.out.println(seats + " seats are available");
		return;
	}
	
	seats= seats -numSeats;
	System.out.println(numSeats + " are reserved");
	System.out.println(seats + " seats are available");
}
}


