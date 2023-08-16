import java.util.Scanner;
class LCM 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("x: ");
		int x = scan.nextInt();
		System.out.println("y: ");
		int y = scan.nextInt();

		if (prime(x) || prime(y))
		{
			int LCM = x*y;
			System.out.println("LCM of "+x+ " and "+y+" is "+LCM);
			return;
		}

		int b = (x>y) ? x:y;
		int s = (x<y) ? x:y;
		int fact = 1;
		for (int i=s; i<=1; i--)
		{
			if (x%i==0 && y%i==0) {
				fact = i;
				break;
			}
				
		}
		while (true)
		{
			if (b%x==0 && b%y ==0)
			{
				System.out.println("LCM of "+x+ " and "+y+" is "+b);
				break;
			}
			else
				b += fact;
		}
	}

	public static boolean prime(int x)
		{
			boolean prime = true;
			for (int i =2; i<=x/2; i++)
			{
				if (x%i==0)
				{
					prime = false;
					break;
				}
			}
			return prime;
		}
}
