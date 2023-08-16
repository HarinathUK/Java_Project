import java.util.Scanner;
class BigAndSmallDigit 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int big = 0;
		int small =9;
		while (num>0)
		{
			int rem = num%10;
			if (rem>big)
				big = rem;
			if (rem<small)
				small = rem;
			num /= 10;
		}
		System.out.println(big);
		System.out.println(small);
	}
}
