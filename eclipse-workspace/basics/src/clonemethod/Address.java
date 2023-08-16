package clonemethod;

public class Address implements Cloneable {
	int hno;
	String street;
	String country;
	long pincode;
	
	public Address(int hno, String street, String country, long pincode) {
		super();
		this.hno = hno;
		this.street = street;
		this.country = country;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", country=" + country + ", pincode=" + pincode + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
		
	
}
