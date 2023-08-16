import java.util.Scanner;
class AutomorpicNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int number = num;
		long square = (long) num*num;
		int count = 0;
		while (num!=0)
		{
			num /= 10;
			count++;
		}
		int res = 0;
		int k = 1;
		for (int i =1; i<=count; i++)
		{
			long rem = square%10;
			res += rem*k;
			k *= 10;
			square /= 10; 
		}
		if (res==number)
			System.out.println("It is an automorpic number");
		else
			System.out.println("It is not an automorpic number");
	}
}
