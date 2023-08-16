import java.util.Scanner;
class Strong
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int number = num;
		int strong = 0;
		while (num!=0)
		{
			int rem = num%10;
			strong += factorial(rem);
			num = num/10;
		}
		if (number==strong)
			System.out.println(number+" is a strong number");
		else
			System.out.println(number+" is not a strong number");
	}
	public static int factorial(int num)
	{
		int fact = num;
		for (int i=num-1; i>1; i--)
		{
			fact *= i;
		}
		return fact;
	}
}



