package exception_handling;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Main starts");
		int a = 10;
		int b = 0;
		for(int i =1; i<=5; i++)
		{
			if(i==5) {
				try {
					System.out.println(a/b);
				}
				catch (ArithmeticException e) 
				{
					System.out.println("Handled");
				}
			}
			System.out.println(i);
		}
		System.out.println("Main ends");

	}

}
