import java.util.Scanner;
class Leap 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = scan.nextInt();
		if (year%4==0 && year%100!=100 || year%400==0)
		{
			System.out.println(year+ " is a leap year");
		}
		else
			System.out.println(year+ " is not a leap yar");
	}
}
