package clonemethod;

public class StudentInfo {
	public static void main (String[] args) throws CloneNotSupportedException
	{
		Student s1 = new Student(1,"kannan", 24);
		System.out.println(s1);
		Student s2 = (Student)s1.clone();
		System.out.println(s2);
		s1.name = "harinath";
		System.out.println(s1);
		System.out.println(s2);
	}
}
