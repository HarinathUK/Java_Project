package equalsMethod;

public class A {
	int i;
	A(int i) {
		this.i=i;
	}
	public boolean equals(Object obj) {
		if (!(obj instanceof A)) return false;
		A a = (A)obj;
		boolean b = this.i == a.i;
		return b;
		}
}

class Z {}

class Test {
	public static void main(String[] args) {
		A a1 = new A(10);
		A a2 = new A(10);
		Z z1 = new Z();
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		System.out.println();
	}
}
