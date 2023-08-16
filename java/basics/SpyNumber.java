import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int res1 = 0;
		int res2 = 1;
		while (num!=0)
		{
			int rem = num%10;
			res1 += rem;
			res2 *= rem;
			num /= 10;

		}
		if (res1 == res2)
			System.out.println("It is a spy number");
		else
			System.out.println("It is not a spy number");

	}
}
