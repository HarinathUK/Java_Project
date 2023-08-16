package equalsMethod;

public class Employee {
	int empid;
	String empName;
	double salary;
	Address addr;
	public Employee(int empid, String empName, double salary, Address addr) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", salary=" + salary + ", addr=" + addr + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof Employee)) return false;
		
		Employee e = (Employee)obj;
		return this.empid==e.empid && this.empName.equals(e.empName) && this.salary==e.salary && this.addr.equals(e.addr);
	}
}
