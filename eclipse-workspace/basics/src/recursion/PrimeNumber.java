package recursion;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 7;
		int i = 2;
		boolean flag = isPrime(n,i);
		if(flag == true) System.out.println("It is a prime number");
		else System.out.println("It is not a prime number");
	}

	private static boolean isPrime(int n, int i) {
		if(n<=1) return false;
		if(n%i==0) return false;
		if(i<=n/2) 
		{
		isPrime(n,++i);
		}
		return true;
	}

}
