package clonemethod;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		B b1 = new B(10,"india");
		A a1 = new A(28, "hari", b1);
		A a2 = (A)a1.clone();
		System.out.println(a1);
		System.out.println(a2);
		a2.name = "karthik";
		a1.b.country="england";
		System.out.println(a1);
		System.out.println(a2);

	}

}
