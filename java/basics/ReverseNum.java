import java.util.Scanner;
class ReverseNum 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		int number = num;
		int result = 0;
		int count = 1;
		while (number!=0)
		{
			number = number/10;
			count *= 10;
		}
		count = count/10;
		while (num!=0)
		{
			result += (num%10)*count;
			num = num/10;
			count = count/10;
		}
		System.out.println(result);

	}
}
