import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	
	int j =0;
	do {
		if (j>=1)
		{
			int num1 = scan.nextInt();
			System.out.println(j+"/3 " + num);
			num = num1;
		}

	int temp = num;
	j++;
	
	if (num>=1000 && num<=9998) {
		
		int rev = 0;
		
		while(num!=0) {
			int rem = num%10;
			rev = rev*10 + rem;
			num /=10;
		}
		if (temp == rev) {
		System.out.println("Wrong pin");
		}
		else {
			System.out.println("correct pin");
			return;
		}
	}
	else {
		System.out.println("Wrong pin");
	}
	} while(j<=3);
	System.out.println("You have reached max attempts");
	
		
}
}