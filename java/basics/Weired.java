import java.util.Scanner;
class Weired
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		if (num>=1 && num<=100)
		{
			if (num%2!=0 || num<=20 && num>5)
				System.out.println("Weired");
			else
				System.out.println("Not weired");
		}
		
	}
}
