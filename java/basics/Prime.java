import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		boolean prime = true;
		if (num==1)
		{
			System.out.println("is not a prime number");
		}
		for (int i=2; i<=num/2; i++)
		{
			if (num%i==0){
				prime = false;
				break;
			}
		}
		if (prime)
			System.out.println("prime");
		else
			System.out.println("Not prime");
	
	}
}
