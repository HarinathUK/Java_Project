import java.util.Scanner;
class Semister 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter subject 1 mark: ");
		int sub1 = scan.nextInt();
		System.out.println("enter subject 2 mark: ");
		int sub2 = scan.nextInt();
		System.out.println("enter subject 3 mark: ");
		int sub3 = scan.nextInt();
		System.out.println("enter subject 4 mark: ");
		int sub4 = scan.nextInt();
		System.out.println("enter subject 5 mark: ");
		int sub5 = scan.nextInt();
		int agg = (sub1+sub2+sub3+sub4+sub5)/5;
		if (sub1<35 && sub2<35 && sub3<35 && sub4<35 && sub5<35)
		{
			System.out.println("fail");
		}
		if (sub1>=35 && sub2>=35 && sub3>=35 && sub4>=35 && sub5>=35)
		{
			System.out.println("All passed");
		}
		if (agg > 90)
		{
			System.out.println("A+ Grade");
		}
		else if (agg > 80 && agg <= 90 )
		{
			System.out.println("A Grade");
		}
		else if (agg>70 && agg<=80)
		{
			System.out.println("B Grade");
		}
	}
}
