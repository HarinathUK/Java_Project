import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		long a = 0L;
		long b = 1L;
		System.out.println(a+ "\n" +b);
		for (int i =1; i<=num-2; i++)
		{
			long c = a+b;
			System.out.println(c);
			a =b;
			b =c;
		}

	}
}
