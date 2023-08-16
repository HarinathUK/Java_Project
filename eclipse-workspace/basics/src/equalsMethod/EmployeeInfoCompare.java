package equalsMethod;

public class EmployeeInfoCompare {

	public static void main(String[] args) {
		Address addr1 = new Address(12,"marathalli","India",560037);
		Address addr2 = new Address(12,"whitefield","India",560037);
		
		Employee e1 = new Employee(1,"Hari",20000,addr1);
		Employee e2 = new Employee(1,"Hari",20000,addr2);
		Employee e3 = new Employee(1,"Hari",20000,addr2);
		
		System.out.println(e1.equals(e3));
		System.out.println(e2.equals(e3));

	}

}
