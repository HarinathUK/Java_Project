import java.util.Scanner;
class Polindrome 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		int number = num;
		int rem = 0;
		int rev =0;
		while (num!=0)
		{
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		System.out.println(rev);
		if (number == rev)
		{
			System.out.println("It is a polindrome number");
		}
		else
			System.out.println("It is not a polindrome number");
	}
}
