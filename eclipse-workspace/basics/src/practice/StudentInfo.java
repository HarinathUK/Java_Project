package practice;

public class StudentInfo {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Address a1 = new Address(1,"england");
		Address a2 = new Address(2,"usa");
		Student s1 = new Student(1,"hari",20,a1);
		Student s2 = (Student)s1.copy();
		System.out.println(s1);
		System.out.println(s2);
		
		s1.a.country="india";
		//s1.age=22;
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
