import java.util.Scanner;
class Methods 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int count = digitsinnum(num);
		System.out.println(count);
	}
	public static int digitsinnum(int num)
	{
		int count = 0;
		while (num!=0)
		{
			num = num/10;
			count++;
		}
		return count;
		
	}
}
