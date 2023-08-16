package exception_handling;

public class Demo3 {

	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.toString());
			System.out.println(s.length());
		}
		catch (NullPointerException e) {
			s = "hari";
			System.out.println(s.toString());
			System.out.println(s.length());
		}
	}

}
