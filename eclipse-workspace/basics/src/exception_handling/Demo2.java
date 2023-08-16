package exception_handling;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("Main starts");
		int[] a= {1,2,3,4,5,6};
		try {
			System.out.println(a[14]);
			System.out.println("Array");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(-1);
		}
		System.out.println("Main ends");
	}

}
