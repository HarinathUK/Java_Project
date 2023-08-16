package recursion;

public class SumNum {

	public static void main(String[] args) {
		int n = 12345;
		int sum = 0;
		m1(sum,n);
	}

	public static void m1(int sum, int n) {
		if(n==0) return;
		sum += n%10;
		n /= 10;
		m1(sum,n);
		if(n==0) System.out.println(sum);
	}

}
