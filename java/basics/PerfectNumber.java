import java.util.Scanner;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int number = num;
		int res = 0;
		for (int i=1; i<num; i++)
		{
			if (num%i==0)
				res += i;
		}
		if (number == res)
			System.out.println("It is a perfect number");
		else
			System.out.println("It is not a perfect number");
	}
}
