import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		do{
		System.out.println("******Home page******");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.exit");
		int num = scan.nextInt();
		System.out.println("Enter two number");
		System.out.println("num1: ");
		int num1 = scan.nextInt();
		System.out.println("num2: ");
		int num2 = scan.nextInt();
	switch (num)
	{
		case 1:
		{
				
				addition(num1,num2);
		}
		break;
		case 2:
		{

				subtraction(num1,num2);
		}
		break;
		case 3:
		{
				multiplication(num1,num2);

		}
		break;
		case 4:
		{
				
				divition(num1,num2);

		}
		break;
		case 5:
		{
				System.out.println("Are you sure\n enter 1 to exit\nenter any other number to continue");
				int key = scan.nextInt();
				if (key ==1)
				{
					flag = false;
					System.out.println("------Thank you------");
				}

		}
		break;

		default:
			System.out.println("Invalid input");
		}
		}while (flag);
		}

		public static void addition(int num1, int num2)
		{
			int addition = num1+num2;
			System.out.println(num1+ "+" +num2+ "=" +addition);
		}
		public static void subtraction(int num1, int num2)
		{
			int subtraction = num1-num2;
			System.out.println(num1+ "-" +num2+ "=" +subtraction);
		}
		public static void multiplication(int num1, int num2)
		{
			int multiplication = num1*num2;
			System.out.println(num1+ "*" +num2+ "=" +multiplication);
		}
		public static void divition(int num1, int num2)
		{
			int divition = num1/num2;
			System.out.println(num1+ "/" +num2+ "=" +divition);
		}

}
