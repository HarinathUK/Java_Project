package recursion;

public class Fact_Num {

	public static void main(String[] args) {
		int n = 5;
		int i = n-1;
		int fact = n;
		m1(fact,i);
	}

	private static void m1(int fact, int i) {
		if(i==0) return;
		fact *= i;
		i--;
		m1(fact,i);
		if(i==0)
			System.out.println(fact);
	}

}
