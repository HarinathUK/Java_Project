package exception_handling;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Main starts");
		for(int i =1; i<=5; i++) {
			if(i==5)
				System.out.println(10/0);
				System.out.println(i);
		}
		System.out.println("Main ends");

	}

}
