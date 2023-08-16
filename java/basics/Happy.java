import java.util.Scanner;
class Happy 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int square = 0;
		if (num==1 || num== 7)
		{
			System.out.println("It is a happy number");
			return;
		}
		for (; num>=10; )
		{
			for (; num>0; num/=10)
			{
				int rem = num%10;
				square += rem*rem;
				
			num = square;
			square = 0;
		}
		if (num==1)
			System.out.println("It is a happy number");
		else
			System.out.println("It is not a happy number");

	}
}
