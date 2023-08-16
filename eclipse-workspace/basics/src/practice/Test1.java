package practice;

public class Test1 {

	public static void main(String[] args) {
		int n = 11;
		boolean flag = true;
		for(int i = 'c'-'a'; i<=n>>('c'-'a'); i++)
		{
			if(n<=1) flag= false;
			if(n%i==0) {
				flag = false;
				break;
			}
		}
		if(flag) System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

}
