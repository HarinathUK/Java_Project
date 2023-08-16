import java.util.Scanner;
class BiggestPrime 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter first number: ");
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		System.out.println("Enter last number");
		int last = scan.nextInt(); 
		for (int i=last; i>=first; i--)
		{
			boolean flag = true;
			for (int j=2; j<=i/2; j++)
			{
				if (i%j==0)
				{
					flag = false;
					break;
				}
			}
			if (flag)
			{
				System.out.println(i);
				return;
			}
		}
	}
}
