package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckMail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter mail id: ");
		String s = scan.next();
		
		String exp = "[A-Z a-z][a-z A-Z 0-9]+@[a-z]+[.]com";
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		if(m.matches())
		System.out.println("Valid mail");
		else
			System.out.println("Invalid mail");

	}

}
