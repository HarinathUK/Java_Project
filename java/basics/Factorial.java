import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int fact = num;
		for (int i=num-1; i>1; i--)
		{
			fact *= i;
		}
		System.out.println(fact);
	}
}
