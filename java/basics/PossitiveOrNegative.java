import java.util.Scanner;
class PossitiveOrNegative
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		if (num>0)
		{
			System.out.println(num+ " is Possitive");
		}
		else if (num<0)
		{
			System.out.println(num+ " is negative");
		}
		else
			System.out.println("It is Zero");
	}
}
