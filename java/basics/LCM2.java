import java.util.Scanner;
class LCM2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("x: ");
		int x = scan.nextInt();
		System.out.println("y: ");
		int y = scan.nextInt();

		int fact = 1;
		for (int i=1; i<=x && i<=y; ++i)
		{
			if (x%i==0 && y%i==0)
			{
				fact = i;
			}
		}
		int LCM = (x*y)/fact;
		System.out.println("LCM of "+x+ " and "+y+" is "+LCM);
	}
}
