package exception_handling;
import java.util.Scanner;
class OutOfServiceException extends RuntimeException {}
class NoChanceException extends Exception {}
public class MatrimonyApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		if(age>=21 && age<=30)
		{
			System.out.println("Chances are more");
		}
		else if(age>=31 && age<=40)
		{
			System.out.println("Chances are less");
		}
		else if(age>=41 && age <=50) {
		try
		{
			throw new NoChanceException();
		}
		catch (NoChanceException e) { System.out.println("What you did in your 30's");}
		}
		else if (age>=51) {
			try {
				throw new OutOfServiceException();
			}
			catch (OutOfServiceException e) { System.out.println("Your are now eligible for 6oth marriage");}
			
			}
		}
		
	}


