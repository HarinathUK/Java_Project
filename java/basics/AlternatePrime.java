import java.util.Scanner;
class AlternatePrime 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter first number: ");
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		System.out.println("Enter last number");
		int last = scan.nextInt(); 
		int count = 1;
		for (int i =first; i<=last; i++)
		{	
			if (i<=1) continue;
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
				count++;
				if (count%2==0)
					System.out.println(i);
			}
			
		}
	}
}
