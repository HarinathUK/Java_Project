package clonemethod;

public class Students implements Cloneable {
	
	int id;
	String name;
	int age;
	Address addr;
	
	public Students(int id, String name, int age, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		Students s = (Students)super.clone();
		s.addr = (Address) addr.clone();
		return s;
	}
}
