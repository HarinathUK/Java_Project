package equalsMethod;

public class StudentCompare {

	public static void main(String[] args) {
		Student s1 = new Student(1,"raj", 23);
		Student s2 = new Student(1, "raj",23);
		System.out.println(s1.equals(s2));

	}

}
