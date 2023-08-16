package array;

class Student {
	String name;
	int id;
	int age;
	String gender;
	public Student(String name, int id, int age, String gender) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
public class StudentArray {

	public static void main(String[] args) {
		Student[] s1 = {new Student("prem",101,22,"male"),
						new Student("hari",102,25,"male"),
						new Student("vamshi",103,20,"female")};
		for (Student e : s1)
		{
			System.out.println(e);
		}
	}

}
