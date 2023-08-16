package recursion;

public class ReverseString {

	public static void main(String[] args) {
		String s = "harinath";
		String temp = "";
		int i = s.length()-1;
		System.out.println(reverse(s,temp,i));
		
	}

	private static String reverse(String s, String temp,int i) {
		if(i<0) return temp;
		temp += s.charAt(i);
		i--;
		return reverse(s,temp,i);
	}
}
