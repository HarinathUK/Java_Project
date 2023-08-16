import java.util.Scanner;

public class ATM {
	static int num = 0;
	public static void main(String[] args) {
	
	ATM.scanInp();
	int j =0;
	do {
		if (j>=1)
		{
			ATM.scanInp();
			System.out.println(j+"/3 ");
		
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
	
	public static void scanInp() {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		num =0;
		try {
			num = Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			System.out.println("invalid input.. please enter a valid integer..");
			return;
	}
}
}