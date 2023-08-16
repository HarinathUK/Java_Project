package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPassword {

	public static void main(String[] args) {
		String s = "Hari7@";
		String exp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*<>()?])([a-z A-Z 0-9 !@#$%^&*<>()?]){6}";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		if(m.matches())
		System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}
