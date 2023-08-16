package exception_handling;

public class ExceptionPropagation {

	public static void main(String[] args) {
		System.out.println("Main starts");
		m1();
		System.out.println("Main ends");

	}

	private static void m1() {
		System.out.println("m1 starts");
		m2();
		System.out.println("m1 ends");

		
	}

	private static void m2() {
		System.out.println("m2 starts");
		m3();
		System.out.println("m2 ends");
		
	}

	private static void m3() {
		System.out.println("m3 starts");
		System.out.println(10/0);
		System.out.println("m3 ends");
		
	}

}
