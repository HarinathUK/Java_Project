import java.util.Scanner;
class Tables 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		for (int i=1; i<=10; i++)
		{
			int k = i*num;
			System.out.println(num+ "*"+i+"="+k);
		}
	}
}
