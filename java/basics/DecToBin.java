import java.util.Scanner;
class DecToBin 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int number = num;
		int bin = 0;
		int i = 1;
		while (num>=1)
		{
			int rem = num%2;
			bin += rem*i;
			i *= 10;
			num /=2;
		}
		System.out.println("Binary number of "+number+" is "+" = "+bin);
	}


}
