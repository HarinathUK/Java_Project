package recursion;

public class CountNum {

	public static void main(String[] args) {
		int n = 12345;
		int count = 0;
		m1(count,n);
	}

	public static void m1(int count, int n) {
		if(n == 0) return;
		count++;
		n/=10;
		m1(count, n);
		if(n==0)
		System.out.println(count);
	}

}
