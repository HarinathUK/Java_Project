import java.util.Scanner;
class Reverse 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int k = 0;
		String result = "";
		while (num!=0)
		{
			k = num%10;
			num = num/10;
			result += k;

		}
		System.out.println(result);

	}
}
