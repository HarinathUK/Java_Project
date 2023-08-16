package equalsMethod;

public class Address {
	int hno;
	String street;
	String country;
	long pincode;
	public Address(int hno, String street, String country, long pincode) {
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
	public boolean equals(Object obj) {
		if (! (obj instanceof Address)) return false;
		
		Address a = (Address)obj;
		return this.hno == a.hno &&
		this.street.equals(a.street) &&
		this.country.equals(a.country) &&
		this.pincode == a.pincode;
	}
	
	
}


