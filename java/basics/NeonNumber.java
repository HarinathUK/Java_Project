import java.util.Scanner;
class NeonNumber
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int square = num*num;
		int res = 0;
		while (square!=0)
		{
			int rem = square%10;
			res += rem;
			square /= 10;
		}
		if (res == num)
			System.out.println("It is a neon number");
		else
			System.out.println("It is not a neon number");

	}
}
