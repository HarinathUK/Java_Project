import java.util.Scanner;
class Employee 
{
	int id;
	String name;
	int age;
	String phno;
	static String companyName;
	static String companyAddress;

	public Employee(int id,String name, int age,String phno)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.phno=phno;
	}

	public void displayEmployeeDetails()
	{
		System.out.println("Employee Id: " + this.id);
		System.out.println("Employee Name: " + this.name);
		System.out.println("Employee Age: " + this.age);
		System.out.println("Employee phone number: " + this.phno);
		System.out.println("Employee Company name: " + companyName);
		System.out.println("Employee company Adress: " + companyAddress);
		System.out.println("********************************************");
		System.out.println();
		
	}

	public static Employee getDetails()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int id = scan.nextInt();
		System.out.println("Enter Employee Name: ");
		String name = scan.next();
		System.out.println("Enter Employee Age: ");
		int age = scan.nextInt();
		System.out.println("Enter Employee Phone number: ");
		String phno = scan.next();
		System.out.println("Enter Employee Comapny name: ");
		String cName = scan.next();
		System.out.println("Enter Employee Company address: ");
		String cAddress = scan.nextLine();

		return new Employee(id,name,age,phno);
	}
}

class EmployeeDetails {

		public static void main(String[] args) {

			Employee.companyName = "HCL";
			Employee.companyAddress = "Bangalore";
			
			Employee e1 = Employee.getDetils(); 
			e1.displayEmployeeDetails();

			Employee e2= Employee.getDetils();
			e2.displayEmployeeDetails();

			Employee e3= new Employee(3,"sai",30,"989765755");

		}
}
		














