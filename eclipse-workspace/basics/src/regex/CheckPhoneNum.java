package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CheckPhoneNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a phone number: ");
		String s = scan.next();
		String exp = "[6-9][0-9]{9}";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		if(m.matches())
		System.out.println("Valid number");
		else
			System.out.println("Invalid number");
	}

}
