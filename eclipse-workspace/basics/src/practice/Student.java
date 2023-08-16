package practice;

public class Student implements Cloneable{
	int id;
	String name;
	int age;
	Address a;
	
	public Student(int id, String name, int age, Address a) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.a = a;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", a=" + a + "]";
	}
	
	public Object copy() throws CloneNotSupportedException {
		//return clone();
		Student s = new Student(this.id, this.name, this.age, this.a);
		return s;
	}
	//@Override
	//protected Object clone() throws CloneNotSupportedException
	//{
	//	Student s =(Student)super.clone();
	//	s.a = (Address) a.clone();
	//	return s;
	//}
}
