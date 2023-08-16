package clonemethod;

public class StudentsInfo {
public static void main(String[] args) throws CloneNotSupportedException
{
	Address addr1 = new Address(12,"mbalayout", "uganda", 202219);
	Students s1 = new Students(1,"pradeep",24,addr1);
	System.out.println(s1);
	Students s2 = (Students) s1.clone();
	System.out.println(s2);
	System.out.println(s1==s2);
	s1.addr.country = "India";
	System.out.println(s1);
	System.out.println(s2);
	s2.addr.pincode  = 111111;
	s2.age = 28;
	System.out.println(s1);
	System.out.println(s2);
	
	
}
}
