package regex;

import java.util.Scanner;

public class VersionCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String1: ");
		String s1 = scan.next();
		System.out.println("Enter String2: ");
		String s2 = scan.next();
		if(s1.equals(s2)) {
			System.out.println("equals");
			return;
		}
		String exp = "([a-z 0-9 A-Z]+[.])+";
	}

}
