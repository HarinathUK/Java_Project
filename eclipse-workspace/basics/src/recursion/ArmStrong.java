package recursion;

public class ArmStrong {

	public static void main(String[] args) {
		int n = 153;
		int count = count(n);
		int sum = armStrong(n,count);
		if(n==sum) System.out.println("It is a Armstrong number");
		else System.out.println("It is not a Armstrong number");
	}

	private static int armStrong(int n, int count) {
		if(n==0) return 0;
		return (int) (Math.pow(n%10, count)+armStrong(n/10,count));
	}

	private static int count(int n) {
		if(n==0) return 0;
		return 1+count(n/10);
	}

}
