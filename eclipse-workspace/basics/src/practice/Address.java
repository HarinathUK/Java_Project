package practice;

public class Address implements Cloneable {
	int no;
	String country;
	public Address(int no, String country) {
		super();
		this.no = no;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [no=" + no + ", country=" + country + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
