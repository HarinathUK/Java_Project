package recursion;

public class Palindrome {

	public static void main(String[] args) {
		int n = 151;
		int temp = 0;
		int pal = palindrome(n,temp);
		if(n==pal) System.out.println("It is a palindrome number");
		else System.out.println("It is not a palindrome number");
	}

	private static int palindrome(int n, int temp) {
		if(n==0) return temp;
		temp = (temp*10)+n%10;
		return palindrome(n/10,temp);
	}

}
