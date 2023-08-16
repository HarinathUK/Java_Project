package com.oops.Abstract;

public abstract class T3 {

	public static void main(String[] args) {
		System.out.println("main method called");
		
	}
	
	public abstract void m1();

}

class Z extends T3 {
	@Override
	public void m1() {
		System.out.println("m1 method called");
	}
}
