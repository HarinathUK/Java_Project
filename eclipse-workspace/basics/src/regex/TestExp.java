package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestExp {

	public static void main(String[] args) {
		String s = "aabcababbcPjnha8b9AkhDfac";
//		String exp = "ab";
//		String exp = "a.b";
//		String exp = "a.";
//		String exp = "a..";
//		String exp = "a[ab]";
//		String exp = "[0-9]";
//		String exp = "[0-9][ab]";
//		String exp = "a[0-9][a-z]";
//		String exp = "a[^ab]";
//		String exp = "[a-z A-Z][^ab]";
//		String exp = "ab+";
//		String exp = "ab*";
//		String exp = "ab?";
//		String exp = "ab{2}";
//		String exp = "ab+c";
//		String exp = "ab*c";
//		String exp = "ab?c";
//		String exp = "[ab]+";
//		String exp = "[a-z][A-Z]+";
		String exp = "([a-z][A-Z])";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		while(m.find())
		System.out.println(m.group());
	}

}
