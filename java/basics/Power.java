import java.util.Scanner;
class Power
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("x: ");
		int x = scan.nextInt();
		System.out.println("y: ");
		int y = scan.nextInt();
		int res = x;
		for (int i=1; i<y; i++)
		{
			res *= x;
		}
		System.out.println(x+ " to the power of "+ y+" = "+res);
	}
}
