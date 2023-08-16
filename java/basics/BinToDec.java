import java.util.Scanner;
class BinToDec 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int number = num;
		int dec = 0;
		int i = 1;
		while (num>=1)
		{
			int rem = num%10;
			dec += rem* i;
			i *= 2;
			num /= 10;
		}
		System.out.println("Decimal number of "+number+" is "+" = "+dec);
	}
}
