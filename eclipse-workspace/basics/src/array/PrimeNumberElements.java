package array;

public class PrimeNumberElements {

	public static void main(String[] args) {
		int[] a = {1,3,5,7,9,11};
		for(int i =0; i<a.length; i++)
		if(isPrime(a[i])) System.out.print(a[i]+" ");
	}

	private static boolean isPrime(int n) {
		if(n<=1) return false;
		boolean flag = true;
		for(int i =2; i<=n/2; i++)
		{
			if(n%i==0) flag = false;
		}
		return flag;
	}

}
