import java.util.Scanner;
class PrimeInRange 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter first number: ");
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		System.out.println("Enter last number");
		int last = scan.nextInt(); 
		for (int i = first; i<=last; i++)
		{
			boolean flag = true;
			if (i<=1) continue;
			for (int j=2; j<=i/2; j++)
			{
				if (i%j==0)
				{
					flag = false;
					break;
				}
			}
			if (flag)
			System.out.println(i);
		}
	}

}
