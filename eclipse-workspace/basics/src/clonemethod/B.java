package clonemethod;

public class B implements Cloneable{
 int id;
 String country;
public B(int id, String country) {
	super();
	this.id = id;
	this.country = country;
}
@Override
public String toString() {
	return "B [id=" + id + ", country=" + country + "]";
}
 @Override
 public Object clone() throws CloneNotSupportedException {
	 return super.clone();
 }
 
}
