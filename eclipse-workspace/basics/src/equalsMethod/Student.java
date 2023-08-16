package equalsMethod;

public class Student {
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name= name;
		this.age= age;
	}
	
	@Override
	public String toString() {
		return "Student[id="+id+",name="+name+",age="+age+"]";
	}
	
	@Override
	public boolean equals(Object arg) {
		if(! (arg instanceof Student)) return false;
		Student s = (Student) arg;
		return this.id == s.id && this.name.equals(s.name) && this.age == s.age;
	}
}
