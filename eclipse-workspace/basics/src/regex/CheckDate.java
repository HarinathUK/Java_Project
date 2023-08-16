package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDate {
		public static void main(String[] args) {
			String s = "30-07-2023";
			String exp = "(0[1-9]|1[0-9]|2[0-9]|3[0 1])-(0[1-9]|1[0-2])-(19[0-9]{2}|20[0-9]{2})";
			
			Pattern p = Pattern.compile(exp);
			Matcher m = p.matcher(s);
			if(m.matches())
			System.out.println("Valid");
			else
				System.out.println("Invalid");

	}

}
