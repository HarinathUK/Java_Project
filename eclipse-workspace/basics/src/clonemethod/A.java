package clonemethod;

public class A implements Cloneable {
	int i;
	String name;
	B b;
	public A(int i, String name, B b) {
		super();
		this.i = i;
		this.name = name;
		this.b = b;
	}
	@Override
	public String toString() {
		return "A [i=" + i + ", name=" + name + ", b=" + b + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		A a = (A) super.clone();
		a.b = (B) b.clone();
		return a;
	}
}

